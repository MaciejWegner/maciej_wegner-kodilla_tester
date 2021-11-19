package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<Task> tasks = TaskRepository.getTasks();
        for (Task task : tasks) {
            System.out.println(task);
        }
        TaskManager taskManager = new TaskManager();

        List<LocalDate> results = taskManager.getDeadlinesOfIncompleteTasks(TaskRepository.getTasks());
        System.out.println(results);
    }

    public List<LocalDate> getDeadlinesOfIncompleteTasks(List<Task> tasks) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> dates = tasks
                .stream()//otwarcie strumienia
                .filter(task -> task.getDeadline().isAfter(currentDate))//filtrowanie wszystkiego co zawiera obiekt Task
                .map(Task::getDeadline)//mapowanie na datę
                .collect(Collectors.toList());//transpormacja
        for (LocalDate date : dates) {
            System.out.println(date);
        }
        System.out.println("**********************************************");


        List<LocalDate> dates1 = tasks //mapowanie, potem filtracja
                .stream()//otwarcie strumienia
                .map(Task::getDeadline)//mapowanie, czyli zebranie strumienia danych potrzebnych z wszystich danych
                .filter(localDate -> localDate.isAfter(currentDate))//filtrowanie
                .collect(Collectors.toList());//transformacja
        return dates1;
    }

}

//    Klasę Task reprezentującą zadanie do wykonania wraz z polami String name,
//    LocalDate opened oraz LocalDate deadline.
//        Klasę TaskRepository z metodą statyczną List<Task> getTasks() zwracającą listę kilku przykładowych zadań.
//        Klasę TaskManager z metodą main, w której przy pomocy Stream oraz operacji filtrowania i transformacji
//        utworzona zostanie lista List<LocalDate> zawierająca daty deadline wszystkich zadań,
//        których data deadline jeszcze nie upłynęła.
//        Wskazówka: aby utworzyć zmienną zawierającą datę (typu LocalDate) można skorzystać z metody of(...) tej klasy:
//
//        LocalDate myDate = LocalDate.of(2019, 11, 20);
//        Aby sprawdzić aktualną datę systemową, można skorzystać z metody now():
//
//        LocalDate currentDate = LocalDate.now()