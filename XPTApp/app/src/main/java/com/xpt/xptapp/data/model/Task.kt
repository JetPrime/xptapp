package com.xpt.xptapp.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Task(
    val id: String? = null,
    val createdAt: String? = null,
    val title: String? = null
)