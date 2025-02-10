file://<WORKSPACE>/src/main/scala/roles/Rouge.scala
### java.lang.IndexOutOfBoundsException: -1

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 446
uri: file://<WORKSPACE>/src/main/scala/roles/Rouge.scala
text:
```scala
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
    skikllsMap(@@)
    var itemBox: ListBuffer[Int] = ListBuffer.empty
}

```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:129)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:244)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:101)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:46)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:435)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1