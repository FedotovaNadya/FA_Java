package aviasales.aviasales.services;

import org.springframework.stereotype.Service;

import aviasales.aviasales.models.Flight;
import aviasales.aviasales.repositories.FlightRepository;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllCities(){
        return flightRepository.findAll();
    }

    public void saveFlight(Flight flight){
        flightRepository.save(flight);
    }

    public void deleteFlight(Integer id){
        flightRepository.deleteById(id);
    }

    public Flight getFlightById(Integer id){
        return flightRepository.findById(id).get();
    } 
}
