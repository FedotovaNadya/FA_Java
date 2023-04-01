package railway.railway.services;

import railway.railway.models.TrainType;
import railway.railway.repositories.TypeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TypeService {
    @Autowired
    private TypeRepository typeRepository;

    public List<TrainType> getAllTypes(){
        return typeRepository.findAll();
    }

    public List<TrainType> getTypeByName(String name){
        return typeRepository.findByName(name);
    }

    public void saveType(TrainType trainType){
        typeRepository.save(trainType);
    }

    public void deleteType(Integer id){
        typeRepository.deleteById(id);
    }

    public TrainType getTypeById(Integer id){
        return typeRepository.findById(id).orElse(null);
    }
}
