file://<WORKSPACE>/scala/attributes/attributes.scala
### scala.MatchError: TypeDef(Speed,Ident(Int)) (of class dotty.tools.dotc.ast.Trees$TypeDef)

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 118
uri: file://<WORKSPACE>/scala/attributes/attributes.scala
text:
```scala
package attributes

type Health = Int
type Attack = (Double, Double)
type Mage = (Double, Double)
type Speed = Int

en@@

trait ConfigureHealth {
  def setHealth(health: Health): Unit
  def getHealth(): Health
}

trait ConfigureAttack {
  def setAttack(attack: Attack): Unit
  def getAttack(): Attack
}

trait ConfigureMage {
  def setMage(attack: Mage): Unit
  def getMage(): Mage
}

trait ConfigureSpeed {
  def setSpeed(attack: Speed): Unit
  def getSpeed(): Speed
}

```



#### Error stacktrace:

```
dotty.tools.pc.completions.KeywordsCompletions$.checkTemplateForNewParents$$anonfun$2(KeywordsCompletions.scala:218)
	scala.Option.map(Option.scala:242)
	dotty.tools.pc.completions.KeywordsCompletions$.checkTemplateForNewParents(KeywordsCompletions.scala:215)
	dotty.tools.pc.completions.KeywordsCompletions$.contribute(KeywordsCompletions.scala:44)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:126)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

scala.MatchError: TypeDef(Speed,Ident(Int)) (of class dotty.tools.dotc.ast.Trees$TypeDef)