package railway.railway.services;

import railway.railway.models.Train;
import railway.railway.repositories.TrainRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TrainService {
    @Autowired
    private TrainRepository trainRepository;

    public List<Train> getAllTrains(){
        return trainRepository.findAll();
    }

    public List<Train> getTrainByName(String name){
        return trainRepository.findByName(name);
    }

    public List<Train> getTrainByNumber(int number){
        return trainRepository.findByNumber(number);
    }

    public List<Train> getTrainByTrainTypeId(int trainType){
        return trainRepository.findByTrainTypeId(trainType);
    }

    public void saveTrain(Train train){
        trainRepository.save(train);
    }

    public void deleteTrain(Integer id){
        trainRepository.deleteById(id);
    }

    public Train getTrainById(Integer id){
        return trainRepository.findById(id).orElse(null);
    }
}
