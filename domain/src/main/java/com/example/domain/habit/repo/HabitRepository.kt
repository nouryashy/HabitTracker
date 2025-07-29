package com.example.domain.habit.repo

import com.example.domain.habit.model.Habit
import kotlinx.coroutines.flow.Flow

interface HabitRepository {
    fun getAllHabits(): Flow<List<Habit>>
    suspend fun addHabit(habit: Habit)
    suspend fun deleteHabit(habit: Habit)
    suspend fun markHabitDone(habit: Habit)
}