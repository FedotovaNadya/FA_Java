package testsdb.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import testsdb.demo.models.StudentAnswer;

public interface StudentAnswerRepository extends JpaRepository <StudentAnswer, Long>{
    @Query(value = """
        Select public.user.row_id, last_name, first_name, group_id,  test_id, Count(public.student_answer.row_id) as "right_answers", 
(	Select Count(row_id)
	From public.test
	where public.test.test_id = public.student_answer.test_id 
 	Group by public.test.test_id
)
FROM public.student_answer, public.user
	WHERE answer_id in (
			select row_id
			from public.answer
			where correct = true 
		)
	and public.user.row_id = user_id
	and role_id = 1
 
GROUP BY public.user.row_id, test_id
ORDER BY row_id ASC 
        """,
        nativeQuery=true)
List<Object[]> findAllResult();
}
