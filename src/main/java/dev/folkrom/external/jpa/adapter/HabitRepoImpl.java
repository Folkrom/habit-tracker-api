package dev.folkrom.external.jpa.adapter;

import dev.folkrom.domain.entity.Habit;
import dev.folkrom.domain.repository.HabitRepository;
import dev.folkrom.external.jpa.model.HabitJpa;
import dev.folkrom.external.jpa.repository.HabitJpaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class HabitRepoImpl implements HabitRepository {
    private final HabitJpaRepository habitJpaRepository;

    @Inject
    public HabitRepoImpl(HabitJpaRepository habitJpaRepository) {
        this.habitJpaRepository = habitJpaRepository;
    }

    @Override
    public void create(Habit habit) {
        habitJpaRepository.save(HabitJpa.fromEntity(habit));
    }
}
