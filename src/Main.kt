fun main() {

    val repository = TaskRepository()
    val crud = ManageTask(repository)
    val handlerMenu = MenuHandler(crud)

    while (true) {
        println("Todo-List App ")
        println("1. Add Task")
        println("2. Show All Task")
        println("3. Update task")
        println("4. Task Done")
        println("5. Remove Task")
        print("Choose ur menu: ")
        val menu = readLine()?.toInt()

        when(menu) {
            1 -> handlerMenu.addTaskHandler()
            2 -> handlerMenu.showAllTaskHandler()
            3 -> handlerMenu.updateTask()
            4 -> handlerMenu.showTaskDone()
            5 -> handlerMenu.removeItem()
        }
    }
}
