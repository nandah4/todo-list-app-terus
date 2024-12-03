import interfaces.ManageTask
import interfaces.TaskStorage

class ManageTask(private val taskStorage: TaskStorage) : ManageTask {
    override fun createTask(item: TaskItem) {
        if(!item.toString().isEmpty()) {
            taskStorage.addTask(item)
            println("Data berhasil di tambahkan")
        } else {
            println("Data tidak boleh kosong")
        }
    }

    override fun getAllTask() {
        if(taskStorage.getTasks().isEmpty()) {
            println("Task Kosong!")
        } else {
            taskStorage.getTasks().forEach { it ->
                println("${it.id} - ${it.description} - ${it.isCompleted}")
            }
        }
    }

    override fun getTaskDone() {
        val taskDone = taskStorage.getTasks().filter { it.isCompleted }

        if (taskStorage.getTasks().isEmpty()) {
            println("Task Kosong")
        } else {
            taskDone.forEach {
                println("${it.id} - ${it.description} - ${it.isCompleted}")
            }
        }
    }

    override fun updateTask(id: Int, description: String, isCompleted: Boolean) {
        val task = taskStorage.getTasks().find { it.id == id }

        if(task != null){
            task.description = description
            task.isCompleted = isCompleted

            println("Berhasil memperbarui task")
        } else {
            println("Task ditemukan")
        }
    }

    override fun removeTask(id: Int) {
        taskStorage.removeItem(id)
        println("Task berhasil dihapus")
    }
}


