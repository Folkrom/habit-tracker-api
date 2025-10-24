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
@Schema(name = "HabitPersistance", description = "Persists an habit")
public class HabitPersistanceDto {
    @JsonProperty
    @Schema(description = "Name of the habit")
    private String name;
    @JsonProperty
    @Schema(description = "Description of the habit")
    private String description;

    public static HabitPersistanceDto fromEntity(Habit habit) {
        return HabitPersistanceDto.builder()
                .name(habit.name())
                .description(habit.description())
                .build();
    }

    public Habit toEntity() {
        return new Habit(null, name, description, null);
    }
}
