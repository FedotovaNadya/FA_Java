package testsdb.demo.repo;

import java.util.List;

import testsdb.demo.models.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    @Query(value = """
            SELECT * FROM public.schedule
            WHERE group_id IN (SELECT group_id FROM public.user WHERE row_id=:userId)\s
            AND test_id NOT IN (SELECT test_id FROM public.student_answer WHERE user_id=:userId)
            """, nativeQuery=true)
    List<Schedule> findAllByUserId(Long userId);}