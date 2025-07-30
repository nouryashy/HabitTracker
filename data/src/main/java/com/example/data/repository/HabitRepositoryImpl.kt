package com.example.data.repository


import com.example.data.local.HabitDao
import com.example.domain.habit.model.Habit
import com.example.domain.habit.repo.HabitRepository
import kotlinx.coroutines.flow.Flow
import com.example.data.mapper.toDomain
import com.example.data.mapper.toEntity
import kotlinx.coroutines.flow.map




class HabitRepositoryImpl(private val dao: HabitDao) : HabitRepository {
    override fun getAllHabits(): Flow<List<Habit>> =
        dao.getAll().map { habits -> habits.map { it.toDomain() } }


    override suspend fun addHabit(habit: Habit) {
        dao.insert(habit.toEntity())
    }

    override suspend fun deleteHabit(habit: Habit) {
        dao.delete(habit.toEntity())
    }

    override suspend fun markHabitDone(habitID: Int) {
        dao.markAsDone(habitID)
    }
}

