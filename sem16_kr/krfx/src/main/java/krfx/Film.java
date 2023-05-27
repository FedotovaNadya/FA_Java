package krfx;

import java.util.Set;


public class Film {
    private int id;
    private String name;
    private String genre;
    private int duration;
    private int year;


    public Film() {
    }

    public Film(int id, String name, String genre, int duration, int year) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.duration = duration;
        this.year = year;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    // public void updateFilm(Film film){
    //     if(film.name != null){
    //         this.name = film.name;
    //     }
    // }
}
