package com.xpt.xptapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.xpt.xptapp.data.model.Task
import com.xpt.xptapp.data.repository.TaskRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TaskViewModel : ViewModel() {

    private val _tasks = MutableStateFlow<List<Task>>(emptyList())
    val tasks = _tasks.asStateFlow()

    fun loadTasks() {
        viewModelScope.launch {
            _tasks.value = TaskRepository.getTasks()
        }
    }

    fun addTask(title: String) {
        viewModelScope.launch {
            TaskRepository.addTask(Task(title = title))
            loadTasks()
        }
    }
}
