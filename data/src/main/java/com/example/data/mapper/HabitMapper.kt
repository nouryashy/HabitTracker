package com.example.data.mapper

import com.example.data.local.HabitEntity
import com.example.domain.habit.model.Habit
import com.example.domain.habit.model.HabitFrequency

class HabitMapper {
    fun HabitEntity.toDomain(): Habit = Habit(
        id = id,
        name = name,
        frequency = HabitFrequency.valueOf(frequency),
        isCompletedToday = isCompletedToday,
        color = color,
        createdAt = createdAt
    )

    fun Habit.toEntity(): HabitEntity = HabitEntity(
        id = id,
        name = name,
        frequency = frequency.name,
        isCompletedToday = isCompletedToday,
        color = color,
        createdAt = createdAt
    )
}