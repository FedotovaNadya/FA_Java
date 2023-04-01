package railway.railway.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;


@Entity
@Table(name = "cities")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "cityTo")
    @JsonIgnore
    private Set<Schedule> schedulesCityTo;

    @OneToMany(mappedBy = "cityFrom")
    @JsonIgnore
    private Set<Schedule> schedulesCityFrom;

    public void updateCity(City city){
        if(city.name != null){
            this.name = city.name;
        }
    }
}
