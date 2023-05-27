package krserv.krserv.controllers;

import krserv.krserv.models.Film;
import krserv.krserv.servises.FilmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @GetMapping("")
    public List<Film> getAllCities(){
        return filmService.getAllCities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> get(@PathVariable Integer id){
        try{
            Film film = filmService.getFilmById(id);
            return new ResponseEntity<Film>(film, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<Film>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/name/{name}")
    public List<Film> getByName(@PathVariable String name){
        return filmService.getFilmByName(name);
    }

    @PostMapping("/")
    public void add(@RequestBody Film film){
        filmService.saveFilm(film);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        filmService.deleteFilm(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Film film, @PathVariable Integer id){
        try{
            Film baseFilm = filmService.getFilmById(id);
            baseFilm.updateFilm(film);
            filmService.saveFilm(baseFilm);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
