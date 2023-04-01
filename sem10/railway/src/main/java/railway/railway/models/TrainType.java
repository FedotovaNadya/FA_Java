package railway.railway.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name="trainType")
@Data
public class TrainType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "trainType")
    @JsonIgnore
    private Set<Train> trains;

    public void updateType(TrainType trainType){
        if(trainType.name != null){
            this.name = trainType.name;
        }
    }
}
