package dev.folkrom.domain.entity;

import java.util.Date;

public record HabitLog(Integer id, Integer habitId, Date date, String status) {
}
