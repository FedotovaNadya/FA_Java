package aviasales.aviasales.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "routes")
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="cityTo", nullable = false)
    private City cityTo;

    @ManyToOne
    @JoinColumn(name="cityFrom", nullable = false)
    private City cityFrom;

    @OneToMany
    @JsonIgnore
    private Set<Flight> flights;

    public void updateRoute(Route route){
        if(route.cityTo != null){
            this.cityTo = route.cityTo;
        }
        if(route.cityFrom != null){
            this.cityFrom = route.cityFrom;
        }
    }

}
