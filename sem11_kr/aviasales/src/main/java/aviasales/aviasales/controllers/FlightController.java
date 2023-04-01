package aviasales.aviasales.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aviasales.aviasales.models.Flight;
import aviasales.aviasales.services.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("")
    public List<Flight> getAllCities(){
        return flightService.getAllCities(); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Integer id){
        try{
            Flight flight = flightService.getFlightById(id);
            return new ResponseEntity<Flight>(flight, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<Flight>(HttpStatus.NOT_FOUND);
        }    }

    @PostMapping("/")
    public void add(@RequestBody Flight flight){
        flightService.saveFlight(flight);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Flight flight, @PathVariable Integer id){
        try{
            Flight baseFlight = flightService.getFlightById(id);
            baseFlight.updateFlight(flight);
            flightService.saveFlight(baseFlight);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        flightService.deleteFlight(id);
    }
}
