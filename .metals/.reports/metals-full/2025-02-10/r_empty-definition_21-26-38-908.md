error id: scala/collection/mutable/
file://<WORKSPACE>/src/main/scala/roles/roles.scala
empty definition using pc, found symbol in pc: scala/collection/mutable/
semanticdb not found
|empty definition using fallback
non-local guesses:
	 -

Document text:

```scala
package roles

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.HashMap
import attributes._

class Warrior
    extends StandardAttributes(
      attack = (120, 100),
      speed = 80,
      mage = (40, 40)
    ) {
  val className = "Warrior"
  val skillsBuffer: ListBuffer[HashMap[Skills, String]] = ListBuffer.empty

  var skikllsMap = HashMap[Skills, String](
    Skills.SwordSwing -> "Attack: Sword Swing"
  )

  var itemBox: ListBuffer[Int] = ListBuffer.empty

}

```

#### Short summary: 

empty definition using pc, found symbol in pc: scala/collection/mutable/