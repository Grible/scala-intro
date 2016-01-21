import java.time.LocalDateTime
object Main {
  case class Task(name: String, dueDate: LocalDateTime = LocalDateTime.now, var isCompleted: Boolean = false)
  val task1: Task = new Task("Eat pizza", dueDate = LocalDateTime.now minusHours 1, isCompleted = true)
  val task2 = Task("Give demo")
  val magicNumber = 42
  val task3 = Task(s"Nr $magicNumber", LocalDateTime.now plusDays 1)

  val tasks: List[Task] = List(task1, task2, task3)

  val completedTasks: List[Task] = tasks.filter(_.isCompleted)

  val pastDueDate: List[Task] = tasks.filter(_.dueDate.isBefore(LocalDateTime.now()))

  val maybeLastTask: Option[Task] = tasks.lastOption

  val lastTaskName = maybeLastTask match {
    case Some(task) => task.name
    case None => ""
  }

  tasks.foreach(task => println(s"Task ${task.name} is completed? ${task.isCompleted}"))
}
