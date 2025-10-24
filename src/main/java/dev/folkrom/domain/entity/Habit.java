package dev.folkrom.domain.entity;

import java.time.LocalDateTime;

public record Habit(Integer id, String name, String description, LocalDateTime createdAt) {
}
