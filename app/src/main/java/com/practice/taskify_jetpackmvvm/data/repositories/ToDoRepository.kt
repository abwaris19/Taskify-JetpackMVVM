package com.practice.taskify_jetpackmvvm.data.repositories

import com.practice.taskify_jetpackmvvm.data.ToDoDao
import com.practice.taskify_jetpackmvvm.data.models.TodoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao){


    val getAllTasks: Flow<List<TodoTask>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<TodoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<TodoTask>> = toDoDao.sortByHighPriority()


    fun getSelectedTask(taskId: Int): Flow<TodoTask> {
        return toDoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(todoTask: TodoTask) {
        toDoDao.addTask(todoTask = todoTask)
    }

    suspend fun updateTask(todoTask: TodoTask) {
        toDoDao.updateTask(todoTask = todoTask)
    }


    suspend fun deleteTask(todoTask: TodoTask) {
        toDoDao.deleteTask(todoTask = todoTask)
    }


    suspend fun deleteAllTasks() {
        toDoDao.deleteAllTasks()
    }

    fun searchDatabase (searchQuery: String): Flow <List<TodoTask>> {
        return toDoDao.searchDatabase(searchQuery = searchQuery)
    }





}