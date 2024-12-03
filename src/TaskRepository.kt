import interfaces.TaskStorage

// low-level module
class TaskRepository : TaskStorage {
    private var repository : MutableList<TaskItem> = mutableListOf()

    override fun addTask(item: TaskItem) {
        repository.add(item)
    }

    override fun getTasks(): List<TaskItem> {
        return repository
    }

    override fun removeItem(id: Int) {
        repository.removeAt(id - 1)
    }
}
