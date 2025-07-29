package com.example.domain.habit.model

data class Habit(
    val id: Int = 0,
    val name: String,
    val frequency: HabitFrequency,
    val isCompleteToday: Boolean = false,
    val color: Long,
    val createdAt: Long = System.currentTimeMillis()
)

enum class HabitFrequency { DAILY, WEEKLY }