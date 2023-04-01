package aviasales.aviasales.services;

import org.springframework.stereotype.Service;

import aviasales.aviasales.models.Route;
import aviasales.aviasales.repositories.RouteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class RouteService {
    @Autowired
    private RouteRepository routeRepository;

    public List<Route> getAllCities(){
        return routeRepository.findAll();
    }

    public void saveRoute(Route route){
        routeRepository.save(route);
    }

    public void deleteRoute(Integer id){
        routeRepository.deleteById(id);
    }

    public Route getRouteById(Integer id){
        return routeRepository.findById(id).get();
    }
}
