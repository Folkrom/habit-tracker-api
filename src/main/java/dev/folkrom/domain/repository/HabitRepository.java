package dev.folkrom.domain.repository;

import dev.folkrom.domain.entity.Habit;

public interface HabitRepository {
    void create(Habit habit);
}
