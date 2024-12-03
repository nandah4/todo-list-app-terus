package interfaces

import TaskItem

interface ManageTask {
    fun createTask(item: TaskItem)
    fun getAllTask()
    fun updateTask(id: Int, desription : String, isCompleted: Boolean)
    fun getTaskDone()
    fun removeTask(id: Int)
}