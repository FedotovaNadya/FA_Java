package krserv.krserv.repo;

import krserv.krserv.models.Film;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface FilmRepository extends JpaRepository<Film, Integer>{
    List<Film> findByName(String name);
}