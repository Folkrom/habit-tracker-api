package dev.folkrom.core.entity;

import java.util.Date;

public record HabitLog(Integer id, Integer habitId, Date date, String status) {
}
