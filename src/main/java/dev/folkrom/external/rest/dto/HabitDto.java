package dev.folkrom.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.folkrom.domain.entity.Habit;
import lombok.*;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Schema(name = "Habit", description = "Represents an habit")
public class HabitDto {
    @JsonProperty
    @Schema(description = "Primary identifier")
    private Integer id;
    @JsonProperty
    @Schema(description = "Name of the habit")
    private String name;
    @JsonProperty
    @Schema(description = "Description of the habit")
    private String description;
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    @Schema(description = "Date and time when the habit was created", format = "dd/MM/yyyy HH:mm:ss", implementation = String.class)
    private LocalDateTime createdAt;

    public static HabitDto fromEntity(Habit habit) {
        return HabitDto.builder()
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
