package dev.folkrom.external.jpa.repository;

import dev.folkrom.external.jpa.model.HabitJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitJpaRepository extends JpaRepository<HabitJpa, Integer> {
}
