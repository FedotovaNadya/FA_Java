package project;

import java.time.LocalDate;

public class Task {
    private Integer id;
    private LocalDate  dateCreate;
    private LocalDate  dateCompletion;
    private String nametask;
    private String description;
    private boolean isDone;

    public Task(int id, String name, String description,LocalDate  dateCreate, LocalDate  dateCompletion){
        this.id = id; //номер
        this.nametask = name;//название задания
        this.description = description; //описание
        this.dateCreate = dateCreate; //дата создания
        this.dateCompletion = dateCompletion; //дата к которой надо выполнить задание
        isDone = false; //статус задания, по умолчанию "не выполнено"
    }
    /*для получения и изменения данных */
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.nametask;
    }
    public void setName(String newName){
        this.nametask = newName;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    
    public LocalDate getDateCreate(){
        return this.dateCreate;
    }
    public void setDateCreate(LocalDate newDate){
        this.dateCreate = newDate;
    }
    public LocalDate getDateCompletion(){
        return this.dateCompletion;
    }
    public void setDateCompletion(LocalDate newDate){
        this.dateCompletion = newDate;
    }
    public Boolean getIsDone(){
        return this.isDone;
    }
    public void setIsDone(Boolean isDone){
        this.isDone = isDone;
    }
    @Override
    public String toString() {

        return
                "Номер: " + id +
                ", Наименование: '" + nametask + '\'' +
                ", Дата создания: " + dateCreate +
                ", Дата выполнения: " + dateCompletion +
                ", Статус: " + isDone +
                ", Детальное описание: '" + description + '\'';
    }


}

