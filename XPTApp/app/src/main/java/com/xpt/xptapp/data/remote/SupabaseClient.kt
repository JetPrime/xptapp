package com.xpt.xptapp.data.remote

import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import com.xpt.xptapp.data.model.Task

object SupabaseClient {

    private const val SUPABASE_URL = "https://nduswaslgthxltibpqud.supabase.co"
    private const val SUPABASE_KEY = "sb_publishable_TOx1lAjoEjAa0p75rg-S0Q_akNbg4g_"

    val client = HttpClient(Android) {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
    }

    suspend fun fetchTasks(): List<Task> {
        return client
            .get("$SUPABASE_URL/rest/v1/tasks?select=*") {
                headers {
                    append("apikey", SUPABASE_KEY)
                    append("Authorization", "Bearer $SUPABASE_KEY")
                }
            }.body()
    }

    suspend fun insertTask(task: Task) {
        client.post("$SUPABASE_URL/rest/v1/tasks") {
            headers {
                append("apikey", SUPABASE_KEY)
                append("Authorization", "Bearer $SUPABASE_KEY")
                append("Content-Type", "application/json")
            }
            setBody(task)
        }
    }

}
