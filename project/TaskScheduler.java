package project;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskScheduler {
    ArrayList<Task> tasksList;
    Scanner scan = new Scanner(System.in);;
    int taskCount = 0;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
    public TaskScheduler(){
        tasksList = new ArrayList<>();
        
    }

    public void start(){
        String act;
        boolean work = true;
        while (work) {
            //выводим меню
            printMenu();
            act = scan.next();
            switch (act) {
                case "0":
                    work = false;
                    break;
                case "1"://создать задание
                    createTask();
                    break;
                case "2"://удалить задание
                    deleteTask();
                    break;
                case "3"://изменить задание
                    editTask();
                    break;
                case "4"://посмотреть задания
                    viewTask();
                    break;
                default:
                    System.out.println("/***********************************/");
                    System.out.println("/ Такого действия пока нет          /");
                    System.out.println("/ Попробуйте ещё раз                /");
                    break;
            }
        }
    }

    private void printMenu() {
        /* вывод  меню */
        System.out.println("/***********************************/");
        System.out.println("/ 0) Выход                          /");
        System.out.println("/ 1) Создать задание                /");        
        System.out.println("/ 2) Удалить задание                /");
        System.out.println("/ 3) Изменить задание               /");
        System.out.println("/ 4) Просмотр заданий               /");
        System.out.println("/***********************************/");
    }
    
    private void createTask() {/*создает новое задание */
        System.out.println("/***********************************/");
        System.out.println("/    Создать задание                /");
        System.out.println("/-----------------------------------/");
        System.out.println("/    Введите название задания       /");
        
        String nameT = scan.next();
        LocalDate dateCreate = LocalDate.now();

        LocalDate dateCompletion = dateInput();
        String description = "";
        System.out.println("/    Хотите добавить описание? Y    /");
        System.out.println("");
        if (scan.next().equals("y")) {
            System.out.println("/    Введите ваше описание          /");
            description = scan.next();
        }
        Task newTask = new Task(taskCount, nameT, description, dateCreate, dateCompletion);
        tasksList.add(newTask);
        taskCount =taskCount+1;
        newTask.toString();
    }

    private void deleteTask(){/* Удалить задание  */
        System.out.println("/***********************************/");
        System.out.println("/    Удалить задание                /");
        String vibor = "";
        do {
        System.out.println("/-----------------------------------/");
        System.out.println("/    Для удаления введите номер     /");
        System.out.println("/    задания                        /");
        printTasks();
            vibor = scan.next();
        }while (!isNumeric(vibor));
        tasksList.remove(Integer.parseInt(vibor));


    }

    private void editTask() {
        System.out.println("/***********************************/");
        System.out.println("/    Изменить задание               /");
        System.out.println("/-----------------------------------/");
        System.out.println("/    Введите название задания       /");
        System.out.println("/    Для измения введите номер      /");
        System.out.println("/    задания                        /");
        boolean exitEdit=true;
        while(exitEdit){
            LocalDate dateCreate;
            LocalDate dateCompletion;
            String nametask="";
            String description = "";
            Boolean isDone= false;
            printTasks();
            System.out.println("/    задания                        /");
            System.out.println("/    Введите номер задания          /");
            String id;
            do {
                id = scan.next();
            }while (!isNumeric(id));
            Integer taskId =Integer.parseInt(id);
            System.out.println("/    Хотите изменить название?      /");
            System.out.println("");
            if (scan.next().equals("y")) {
                System.out.println("/    задания                        /");
                System.out.println("/    Введите новое название         /");
                nametask = scan.next();

            }else {
                nametask=tasksList.get(taskId).getName();
            }

            System.out.println("/    Хотите изменить дату       /");
            System.out.println("/    выполнения?                        /");

            if (scan.next().equals("y")) {
                dateCompletion = dateInput();
            }else{
                dateCompletion=tasksList.get(taskId).getDateCompletion();
            }
            
            System.out.println("/    Хотите изменить дату       /");
            System.out.println("/    создания?                  /");

            if (scan.next().equals("y")) {
                dateCreate = dateInput();
            }else{
                dateCreate=tasksList.get(taskId).getDateCompletion();
            }
            
            System.out.println("/    Хотите изменить описание?      /");

            System.out.println("Хотите изменить описание задания?");
            if (scan.next().equals("y")) {
                System.out.println("/    Введите новое описание         /");

                description = scan.next();

            }else {
                description = tasksList.get(taskId).getDescription();
            }

            System.out.println("/    Хотите изменить            /");
            System.out.println("/    статус  ?                  /");

            if (scan.next().equals("y")) {
                System.out.println("/    Введите новый статус       /");
                System.out.println("/    0) Не выполено             /");
                System.out.println("/    1) Выполено                /");
                if (scan.next()=="1"){
                    isDone = true;
                }
            }else{
                isDone=tasksList.get(taskId).getIsDone();
            }

            //db.edit(datecompletion,nametask,description, Integer.valueOf(id));

            System.out.println("/ 0) Выход                          /");
            System.out.println("/ 1) Продолжить редактировать       /");        
            System.out.println("/ 2) Сохранить                      /");

            String act = scan.next();
            switch (act){
                case "0":
                    return;
                case "2":
                    tasksList.get(taskId).setName(nametask);
                    tasksList.get(taskId).setDateCreate(dateCreate);
                    tasksList.get(taskId).setDateCompletion(dateCompletion);
                    tasksList.get(taskId).setDescription(description);
                    tasksList.get(taskId).setIsDone(isDone);
                    
            }

            System.out.println("Для выхода напишите ex для продолжения " );
            System.out.println("редактирования любую кнопку");
            if(scan.next().equals("ex")){
                exitEdit=false;
            }
        }

    }

    private void viewTask() {/* просмотр заданий */
        while (true){
            System.out.println("/***********************************/");
            System.out.println("/    Просмотр заданий               /");
            System.out.println("/-----------------------------------/");
            System.out.println("/    0)Назад                        /");
            System.out.println("/    1)Все задачи                   /");
            System.out.println("/    2)Показать выполненые задачи   /");
            System.out.println("/    3)Показать невыполненые задачи /");

            System.out.println("/    4)Показать выполненые задачи   /");
            System.out.println("/    по дате выполнения             /");
            System.out.println("/    5)Показать невыполненые задачи /");
            System.out.println("/    по дате выполнения             /");

            System.out.println("/    6)Показать выполненые задачи   /");
            System.out.println("/    по дате создания               /");
            System.out.println("/    7)Показать невыполненые задачи /");
            System.out.println("/    по дате создания               /");
            System.out.println("/    8)Показать задание             /");




            String vibor = scan.next();
            switch (vibor) {
                case "0": //в главное меню
                    return;

                case "1": //все
                    printTasks();
                    break;
                case "2"://выполненые задачи
                    printComplTasks();
                    break;
                case "3"://невыполненые задачи
                    printNOComplTasks();
                    break;
                case "4"://выполненые задачи по дате выполнения
                    printComplTasksCompletion();
                    break;
                case "5"://невыполненые задачи по дате выполнения
                    printNOComplTasksCompletion();
                    break;
                case "6"://выполненые задачи по дате создания
                    printComplTasksCreate();
                    break;
                case "7"://невыполненые задачи по дате создания
                    printNOComplTasksCreate();
                    break;
            
                case "8":
                    System.out.println("/    Для просмотра введите номер     /");
                    System.out.println("/    задания                        /");
                    vibor = scan.next();
                    while (!isNumeric(vibor));
                    try{
                        tasksList.get(Integer.parseInt(vibor)).toString();
                    }catch (IndexOutOfBoundsException e) {
                        System.out.println("/    Задание отсутсвует              /");
                    }
                    
                    break;
                default:
                    System.out.println("/***********************************/");
                    System.out.println("/ Такого действия пока нет          /");
                    System.out.println("/ Попробуйте ещё раз                /");
                    break;

            }
        }

    }
    
    private void printTasks(){/*вывод всех заданий */
        for (Task t:tasksList) {
            System.out.println(t.toString());
        }
    }

    private void printComplTasks(){/*выполненные задачи  */
        for (Task t:tasksList) {
            if (t.getIsDone())
                System.out.println(t.toString());
        }
    }
    private void printComplTasksCreate(){/*выполненные задачи по дате создания */

        LocalDate date;
        date = dateInput();
        for (Task t:tasksList) {
            
            if ((t.getIsDone()) && (t.getDateCreate().isEqual(date)))
                System.out.println(t.toString());
        }
    }
    private void printComplTasksCompletion(){/*выполненные задачи по дате выполнения */

        LocalDate date;
        date = dateInput();
        for (Task t:tasksList) {
            
            if ((t.getIsDone()) && (t.getDateCompletion().isEqual(date)))
                System.out.println(t.toString());
        }
    }
    private void printNOComplTasks(){        /*невыполненные задачи  */

        for (Task t:tasksList) {
            if (!t.getIsDone())
                System.out.println(t.toString());
        }
    }
    private void printNOComplTasksCreate(){        /*невыполненные задачи по дате создания */
        LocalDate date;
        date = dateInput();
        for (Task t:tasksList) {
            if ((!t.getIsDone()) && (t.getDateCreate().isEqual(date)))
                System.out.println(t.toString());
        }
    }
    private void printNOComplTasksCompletion(){        /*невыполненные задачи по дате выполнения */
        LocalDate date;
        date = dateInput();
        for (Task t:tasksList) {
            if ((!t.getIsDone()) && (t.getDateCompletion().isEqual(date)))
                System.out.println(t.toString());
        }
    }

    public static boolean isNumeric(String string) {
        /*проверка что в строке - число и только число и её можно преобразовать к int */
        // int intValue;
        if (string == null || string.equals("")) {
            return false;
        }
        try {
            // intValue =
             Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }  

    /* ввод даты  */
    private LocalDate dateInput(){
        LocalDate ldate;
        while (true)
        {
            try{
                System.out.println("/    Введите название задания       /");
                System.out.println("/    Введите дату в формате         /");
                System.out.println("/    ДД/ММ/ГГГГ                     /");

                String date = scan.next();
                ldate = LocalDate.parse(date,formatter);
            } catch (java.time.format.DateTimeParseException e){
                System.out.println("/    Неверный формат!               /");
                continue;
            }
            break;
        }
        //System.out.println("/==  "+ldate+"         ==/"); //отладочная

        return ldate;
    }
}