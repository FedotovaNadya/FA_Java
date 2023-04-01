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

import aviasales.aviasales.models.City;
import aviasales.aviasales.services.CityService;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("")
    public List<City> getAllCities(){
        return cityService.getAllCities(); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable Integer id){
        try{
            City city = cityService.getCityById(id);
            return new ResponseEntity<City>(city, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<City>(HttpStatus.NOT_FOUND);
        }    }

    @PostMapping("/")
    public void add(@RequestBody City city){
        cityService.saveCity(city);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody City city, @PathVariable Integer id){
        try{
            City baseCity = cityService.getCityById(id);
            baseCity.updateCity(city);
            cityService.saveCity(baseCity);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        cityService.deleteCity(id);
    }

}
