package dev.folkrom.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HabitStatus {
    COMPLETED("Completed"),
    SKIPPED("Skipped"),
    PENDING("Pending");

    private final String status;
}
