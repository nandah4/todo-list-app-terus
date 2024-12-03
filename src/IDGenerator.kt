object IDGenerator {
    // return number from 1
    private var currentId = 0

    fun getId() : Int {
        currentId++
        return  currentId
    }
}