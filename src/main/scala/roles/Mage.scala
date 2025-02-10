package roles

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.HashMap
import attributes._


class Mage extends StandardAttributes (
    attack = (40,40),
    speed = 80,
    mage = (120,100)
) {
    val className = "Warrior"
    val skillsBuffer: ListBuffer[HashMap[Skills, String]] = ListBuffer.empty

    var skikllsMap = HashMap[Skills, String](
        Skills.Fireball -> "Attack: Fireball"
    )
    var itemBox: ListBuffer[Int] = ListBuffer.empty
}
