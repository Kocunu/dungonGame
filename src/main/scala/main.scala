import roles._
import scala.io.StdIn

@main
def main(): Unit = {
  startingMessage()
  Thread.sleep(1000)
  val userRoleName = StdIn.readLine().toString()
  val userName = StdIn.readLine().toString()
  val user = new User(userName, userRoleName)
}

def startingMessage(): Unit = {
  println("Welcome to the dungon!")
  println("This is a text style game so you only need to type and read")
  println("You are a adventuere in a dungon and you need to safe the princes")
  println("First of all please enter your name")
}
