class MenuHandler(private val crud : ManageTask) {
    fun addTaskHandler() {
        outerLoop@
        while (true) {
            print("Masukkan Tugas Anda: ")
            val description : String = readLine().toString().trim()
            if(description.isEmpty()) {
                println("Deskripsi tidak boleh kosong, ulangi!")
                continue@outerLoop
            }

            print("Apakah tugas ini selesai? {y/n}: ")
            val isTrue = readLine()?.trim()
            var isCompleted = false
            if(isTrue.equals("y", true)) {
                isCompleted = true
            }

            var id = IDGenerator.getId()
            crud.createTask(TaskItem(id, description, isCompleted))

            print("Tambahkan task baru? {y/n}: ")
            val innerMenu = readLine()?.trim()
            if(innerMenu.equals("n", true)) {
                continue@outerLoop
            }
        }
    }

    fun showAllTaskHandler() {
        outerLoopShowAll@while(true) {
            crud.getAllTask()

            print("Keluar menu? {y/n}: ")
            val innerMenu = readLine()?.trim()
            if(innerMenu.equals("n", true)) {
                continue@outerLoopShowAll
            }
        }
    }

    fun updateTask() {
        while (true){
            print("1. Tandai Task (done)")
            print("2. Ubah deskripsi Task")
            print("3. Keluar menu update")
            print("Pilih menu di atas : ")
            val menu = readLine()?.toInt()
        }


        print("Task berapa yang ingin anda ubah? ")
        val id = readLine()?.toInt() ?: -1

        outerLoopUpdate@while (true) {

        }
        print("Masukkan deskripsi: ")
        val description = readLine().toString().trim()

        println("Apakah task sudah selesai? {true/false}")
        val isCompleted : Boolean = readLine()?.toBoolean() ?: false

        crud.updateTask(id, description, isCompleted)
    }

    fun showTaskDone() {
        println("List task yang sudah selesai: ")
        crud.getTaskDone()
    }

    fun removeItem() {
        println("Masukkan id task: ")
        val id = readLine()?.toInt() ?: 0
        crud.removeTask(id)
    }


}