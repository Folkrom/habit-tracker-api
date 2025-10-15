package dev.folkrom.core.entity;

import java.time.LocalDateTime;

public record Habit(Integer id, String name, String description, LocalDateTime createdAt) {
}
