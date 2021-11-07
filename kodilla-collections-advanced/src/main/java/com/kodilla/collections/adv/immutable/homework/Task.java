package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    private final String title;
    private final int duration;

    public Task(String title, int duration, int dateOfStart) {
        this.title = title;
        this.duration = duration;
            }

    public final String getTitle() {
        return title;
    }

    public final int getDuration() {
        return duration;
    }


}
  //  Stwórz nowy pakiet com.kodilla.collections.adv.immutable.homework,
//  a w nim klasę Task, która będzie posiadała dwa pola: String title oraz int duration.
//  Spraw, aby klasa Task była niemutowalna.