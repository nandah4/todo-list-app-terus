package interfaces

import TaskItem

interface TaskStorage{
    fun addTask(item: TaskItem)
    fun getTasks() : List<TaskItem>
    fun removeItem(id : Int)
}