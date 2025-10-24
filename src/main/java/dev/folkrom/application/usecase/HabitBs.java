package dev.folkrom.application.usecase;

import dev.folkrom.application.service.HabitService;
import dev.folkrom.domain.entity.Habit;
import dev.folkrom.domain.repository.HabitRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;

@ApplicationScoped
public class HabitBs implements HabitService {
    private final HabitRepository habitRepository;

    @Inject
    public HabitBs(HabitRepository habitRepository) {
        this.habitRepository = habitRepository;
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public Boolean create(Habit habit) {
        var habitSave = new Habit(null, habit.name(), habit.description(), LocalDateTime.now());
        habitRepository.create(habitSave);
        return true;
    }
}
