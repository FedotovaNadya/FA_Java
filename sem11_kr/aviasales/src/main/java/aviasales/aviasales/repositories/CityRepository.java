package aviasales.aviasales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aviasales.aviasales.models.City;

public interface  CityRepository extends JpaRepository <City, Integer> {
    
}
