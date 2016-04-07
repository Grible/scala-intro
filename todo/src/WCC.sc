import java.time.LocalDateTime

object Main {
  case class Task(name: String,
                  dueDate: LocalDateTime = LocalDateTime.now(),
                  isCompleted: Boolean = false)

  val task1 = new Task("Eat pizza",
    LocalDateTime.now().plusMinutes(15), false)

  val task2 = Task("Give demo", isCompleted = true)
  val task3 = Task("Sleep", LocalDateTime.now().plusHours(5))

  val tasks = List(task1, task2, task3)

  val completedTasks = tasks.filter(_.isCompleted)

  tasks.sortWith((t1, t2) => t1.dueDate isBefore t2.dueDate)

  1 + 3


}