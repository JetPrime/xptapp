package com.xpt.xptapp.data.repository

import com.xpt.xptapp.data.model.Task
import com.xpt.xptapp.data.remote.SupabaseClient

object TaskRepository {

    suspend fun getTasks(): List<Task> =
        SupabaseClient.fetchTasks()

    suspend fun addTask(task: Task) =
        SupabaseClient.insertTask(task)
}
