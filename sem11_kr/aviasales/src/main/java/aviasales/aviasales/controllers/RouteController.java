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

import aviasales.aviasales.models.Route;
import aviasales.aviasales.services.RouteService;

@RestController
@RequestMapping("/routes")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @GetMapping("")
    public List<Route> getAllCities(){
        return routeService.getAllCities(); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<Route> getRouteById(@PathVariable Integer id){
        try{
            Route route = routeService.getRouteById(id);
            return new ResponseEntity<Route>(route, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<Route>(HttpStatus.NOT_FOUND);
        }    }

    @PostMapping("/")
    public void add(@RequestBody Route route){
        routeService.saveRoute(route);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Route route, @PathVariable Integer id){
        try{
            Route baseRoute = routeService.getRouteById(id);
            baseRoute.updateRoute(route);
            routeService.saveRoute(baseRoute);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        routeService.deleteRoute(id);
    }
}
