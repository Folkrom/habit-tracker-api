package dev.folkrom.application.service;

import dev.folkrom.domain.entity.Habit;


public interface HabitService {
    Boolean create(Habit habit);
}
