package com.practice.taskify_jetpackmvvm.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.practice.taskify_jetpackmvvm.util.constants

@Entity(tableName = constants.DATABASE_TABLE)
data class TodoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority


){ }
