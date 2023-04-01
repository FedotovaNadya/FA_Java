package railway.railway.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name="train")
@Data
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int number;

    @ManyToOne
    @JoinColumn(name="trainTypeId", nullable = false)
    private TrainType trainType;

    @OneToMany(mappedBy = "train")
    @JsonIgnore
    private Set<Schedule> schedulesTrain;

    public void updateTrain(Train train){
        if(train.name != null){
            this.name = train.name;
        }
        if(train.trainType != null){
            this.trainType = train.trainType;
        }
        if(train.number != 0){
            this.number = train.number;
        }
    }
}
