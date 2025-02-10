import scala.io.StdIn
import scala.annotation.retains

@main
def main(): Unit = {
  startingMessage()
  val userName = StdIn.readLine()
  println(s"Soo your name is $userName intresting okey lets beginn")
  Thread.sleep(2000)
  printf("Now choose a door: left or right")
  val door1 = Door1()
  val door2 = Door2()
  var userChose = choice()
  userChose match
    case d: Door1 => 
      if(d.solveMathPuzzle()) {
        println("You may pase")
      } else {
        println()
      }
    case d: Door2 => 
      printf("You may pass")
}

def choice(): Door = {
  val choosenDoor = StdIn.readLine().toLowerCase()
  var result = choosenDoor match
    case "left" => Door1()
    case "right" => Door2()
    case _ => 
      println("left or right")
      choice()
    
  return result
}

sealed trait Door

case class Door1() extends Door {
  def solveMathPuzzle(): Boolean = {
    println("What is the 5th prime number including 1")
    try {
      val inputUser = StdIn.readLine().toInt
      return if (inputUser == 11) then true else false
    } catch {
      case e: NumberFormatException => println("Please Input a Number")
      solveMathPuzzle()
    }
  }
}

case class Door2() extends Door {
  def solvingGeoProblem(): Boolean = {
    println("What is the capital of Germany")
    try {
      val inputUser = StdIn.readLine()
      return if (inputUser == "Berlin") then true else false
    } catch {
      case e: scala.util.control.Exception.type => println("Pleas input a String")
      solvingGeoProblem()
    }
  }
}

def startingMessage(): Unit = {
  println("Welcome to the to the room")
  println("The challange of this game is, getting out of the room")
  pause()
  println("First of all five me your name")
  pause()
}

def pause(): Unit = {
  Thread.sleep(1000)
}


