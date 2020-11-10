package dev.lucaswilliameufrasio.todolistapp

data class Todo (
    val title: String,
    var isChecked: Boolean = false
)