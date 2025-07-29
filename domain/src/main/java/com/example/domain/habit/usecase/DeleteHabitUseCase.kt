package com.example.domain.habit.usecase

import com.example.domain.habit.model.Habit
import com.example.domain.habit.repo.HabitRepository

class DeleteHabitUseCase(private val habitRepository: HabitRepository) {
    suspend operator fun invoke(habit: Habit) = habitRepository.deleteHabit(habit)
}