package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("zapłać z śmieci", LocalDate.of(2021, 6,1),
                LocalDate.of(2021,11,17)));
        tasks.add(new Task("zamów kominiarza", LocalDate.of(2021,9,8),
                LocalDate.of(2021,11,13)));
        tasks.add(new Task("Wyczyścić rynny", LocalDate.of(2021,10,10),
                LocalDate.of(2021,11,16)));

        return tasks;
    }
}