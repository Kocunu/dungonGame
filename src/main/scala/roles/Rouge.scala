package roles

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.HashMap
import attributes._


class Rouge extends StandardAttributes (
    attack = (100,100),
    speed = 120,
    mage = (80,80)
) {
    val className = "Warrior"
    val skillsBuffer: ListBuffer[HashMap[Skills, String]] = ListBuffer.empty

    var skikllsMap = HashMap[Skills, String](
        Skills.Fireball -> "Attack: Fireball"
    )
    skikllsMap += Skills.SwordSwing -> "Attack: SwordSwing"

    var itemBox: ListBuffer[Int] = ListBuffer.empty
}
