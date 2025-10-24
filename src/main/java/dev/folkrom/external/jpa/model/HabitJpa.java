package dev.folkrom.external.jpa.model;

import dev.folkrom.domain.entity.Habit;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "Habit")
public class HabitJpa {
    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "habit_id_seq")
    @SequenceGenerator(name = "habit_id_seq", sequenceName = "habit_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    public static HabitJpa fromEntity(Habit habit) {
        return HabitJpa.builder()
                .id(habit.id())
                .name(habit.name())
                .description(habit.description())
                .createdAt(habit.createdAt())
                .build();
    }

    public Habit toEntity() {
        return new Habit(id, name, description, createdAt);
    }
}


