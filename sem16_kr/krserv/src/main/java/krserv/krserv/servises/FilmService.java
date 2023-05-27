package krserv.krserv.servises;

import krserv.krserv.models.Film;
import krserv.krserv.repo.FilmRepository;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    
    public List<Film> getAllCities(){
        return filmRepository.findAll();
    }

    public List<Film> getFilmByName(String name){
        return filmRepository.findByName(name);
    }

    public void saveFilm(Film film){
        filmRepository.save(film);
    }

    public void deleteFilm(Integer id){
        filmRepository.deleteById(id);
    }

    public Film getFilmById(Integer id){
        return filmRepository.findById(id).orElse(null);
    }
}
