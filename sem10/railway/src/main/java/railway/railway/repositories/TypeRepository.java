package railway.railway.repositories;
import railway.railway.models.TrainType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeRepository extends JpaRepository<TrainType, Integer> {
    List<TrainType> findByName(String name);
}
