package dev.folkrom.domain.entity;

import java.time.LocalDateTime;

public record Routine(Integer id, String title, LocalDateTime createdAt) {
}
