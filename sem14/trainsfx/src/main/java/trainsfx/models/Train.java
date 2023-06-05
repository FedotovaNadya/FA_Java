package trainsfx.models;

public class Train{
    private Integer id;
    private String trainName, trainType;
    private Integer wagons, seatsWagon;
    
    public Train() {
    }
    
    
    public Train(String trainName, String trainType, Integer wagons, Integer seatsWagon) {
        this.trainName = trainName;
        this.trainType = trainType;
        this.wagons = wagons;
        this.seatsWagon = seatsWagon;
    }

   
    public Train(Integer id, String trainName, String trainType, Integer wagons, Integer seatsWagon) {
        this.id = id;
        this.trainName = trainName;
        this.trainType = trainType;
        this.wagons = wagons;
        this.seatsWagon = seatsWagon;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTrainName() {
        return trainName;
    }
    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
    public String getTrainType() {
        return trainType;
    }
    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }
    public Integer getWagons() {
        return wagons;
    }
    public void setWagons(Integer wagons) {
        this.wagons = wagons;
    }
    public Integer getSeatsWagon() {
        return seatsWagon;
    }
    public void setSeatsWagon(Integer seatsWagon) {
        this.seatsWagon = seatsWagon;
    }

    

}
