package aviasales.aviasales.models;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "routeId", nullable = false)
    private Route routeId;

    private String aviaName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy HH:mm")
    private LocalDateTime datetime;
    private int duration;

    public void updateFlight(Flight flight) {
        if (flight.routeId != null) {
            this.routeId = flight.routeId;
        }
        if (flight.aviaName != null) {
            this.aviaName = flight.aviaName;
        }
        if (flight.datetime != null) {
            this.datetime = flight.datetime;
        }
        if (flight.duration != 0) {
            this.duration = flight.duration;
        }
    }

}
