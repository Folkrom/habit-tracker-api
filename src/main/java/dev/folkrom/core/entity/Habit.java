package dev.folkrom.business.entity;

import java.time.LocalDateTime;

public record Habit(Integer id, String name, String description, LocalDateTime ) {
}
