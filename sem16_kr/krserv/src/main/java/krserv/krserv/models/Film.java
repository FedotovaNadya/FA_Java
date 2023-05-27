package krserv.krserv.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity
@Table(name = "films")
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String genre;
    private int duration;
    private int year;

    public void updateFilm(Film film){
        if(film.name != null){
            this.name = film.name;
        }
    }
}
