package aviasales.aviasales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aviasales.aviasales.models.Route;

public interface RouteRepository extends JpaRepository<Route, Integer>{
    
}
