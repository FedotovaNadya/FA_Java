package railway.railway.repositories;

import railway.railway.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainRepository extends JpaRepository<Train, Integer> {
        List<Train> findByName(String name);
        List<Train> findByNumber(int number);
        List<Train> findByTrainTypeId(int trainType);
}
