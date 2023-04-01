package aviasales.aviasales.services;

import org.springframework.stereotype.Service;

import aviasales.aviasales.models.City;
import aviasales.aviasales.repositories.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<City> getAllCities(){
        return cityRepository.findAll();
    }

    public void saveCity(City city){
        cityRepository.save(city);
    }

    public void deleteCity(Integer id){
        cityRepository.deleteById(id);
    }

    public City getCityById(Integer id){
        return cityRepository.findById(id).get();
    }
}
