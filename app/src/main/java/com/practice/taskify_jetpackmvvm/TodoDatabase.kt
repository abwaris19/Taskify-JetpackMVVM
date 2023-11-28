package com.practice.taskify_jetpackmvvm

import androidx.room.Database
import androidx.room.RoomDatabase
import com.practice.taskify_jetpackmvvm.data.ToDoDao
import com.practice.taskify_jetpackmvvm.data.models.TodoTask

@Database(entities = [TodoTask::class], version = 1, exportSchema = false)
abstract class TodoDatabase: RoomDatabase() {

    abstract fun toDoDao(): ToDoDao
}