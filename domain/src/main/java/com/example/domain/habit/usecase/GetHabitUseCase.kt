package com.example.domain.habit.usecase

import com.example.domain.habit.repo.HabitRepository

class GetHabitUseCase(private val habitRepository: HabitRepository)  {
    operator fun invoke() = habitRepository.getAllHabits()
}