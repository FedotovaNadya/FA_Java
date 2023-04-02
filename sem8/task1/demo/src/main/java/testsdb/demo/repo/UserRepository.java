package testsdb.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import testsdb.demo.models.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    List<User> findAllByRoleId(Long roleId);
}
