package aviasales.aviasales.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import aviasales.aviasales.models.Flight;


public interface FlightRepository extends JpaRepository<Flight, Integer>{
    
}

