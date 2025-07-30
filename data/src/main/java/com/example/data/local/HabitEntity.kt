package com.example.data.local


@Entity(tableName = "habits")
data class HabitEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val frequency: String,
    val isCompletedToday: Boolean,
    val color: Long,
    val createdAt: Long
)