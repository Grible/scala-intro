import java.time.LocalDateTime

object Main {
  class Task(private val name: String, private val dueDate: LocalDateTime, private var completed: Boolean) {

    def setCompleted(completed: Boolean): Unit = {
      this.completed = completed
    }
    def isCompleted: Boolean = {
      return this.completed
    }

    def getName: String = {
      return this.name
    }

    def getDueDate: LocalDateTime = {
      return this.dueDate
    }

    override def toString: String = {
      return "Task " + this.name + " is completed? " + this.isCompleted
    }
  }

  val task1 = new Task("Eat pizza", LocalDateTime.now().minusHours(1), true)

  object Task {
    def apply(name: String, dueDate: LocalDateTime = LocalDateTime.now, isCompleted: Boolean = false): Task = {
      return new Task(name, dueDate, isCompleted)
    }
  }

  val task2 = Task("Give demo")
}
