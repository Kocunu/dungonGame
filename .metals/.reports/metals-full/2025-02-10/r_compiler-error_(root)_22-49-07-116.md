file://<WORKSPACE>/src/main/scala/main.scala
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file://<WORKSPACE>/src/main/scala/main.scala
text:
```scala
import scala.io.StdIn

@main
def main(): Unit = {
  startingMessage()
  val userName = StdIn.readLine()
  println(s"Soo your name is $userName intresting okey lets beginn")
  Thread.sleep(2000)
  printf("Now choose a door")
  val door1 = Door1()
  val door2 = Door2()
  choosenDoor match
    case left: Door1()
  
  
}

def choice(): 

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



```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.core.Annotations$LazyAnnotation.tree(Annotations.scala:139)
	dotty.tools.dotc.core.Annotations$Annotation$Child$.unapply(Annotations.scala:245)
	dotty.tools.dotc.typer.Namer.insertInto$1(Namer.scala:476)
	dotty.tools.dotc.typer.Namer.addChild(Namer.scala:487)
	dotty.tools.dotc.typer.Namer$Completer.register$1(Namer.scala:931)
	dotty.tools.dotc.typer.Namer$Completer.registerIfChildInCreationContext$$anonfun$1(Namer.scala:940)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.typer.Namer$Completer.registerIfChildInCreationContext(Namer.scala:940)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:829)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:188)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:190)
	dotty.tools.dotc.core.Types$NamedType.info(Types.scala:2363)
	dotty.tools.dotc.core.Types$TermLambda.dotty$tools$dotc$core$Types$TermLambda$$_$compute$1(Types.scala:3893)
	dotty.tools.dotc.core.Types$TermLambda.foldArgs$2(Types.scala:3900)
	dotty.tools.dotc.core.Types$TermLambda.dotty$tools$dotc$core$Types$TermLambda$$_$compute$1(Types.scala:4520)
	dotty.tools.dotc.core.Types$TermLambda.dotty$tools$dotc$core$Types$TermLambda$$depStatus(Types.scala:3920)
	dotty.tools.dotc.core.Types$TermLambda.dependencyStatus(Types.scala:3934)
	dotty.tools.dotc.core.Types$TermLambda.isResultDependent(Types.scala:3956)
	dotty.tools.dotc.core.Types$TermLambda.isResultDependent$(Types.scala:3850)
	dotty.tools.dotc.core.Types$MethodType.isResultDependent(Types.scala:3995)
	dotty.tools.dotc.typer.TypeAssigner.assignType(TypeAssigner.scala:295)
	dotty.tools.dotc.typer.TypeAssigner.assignType$(TypeAssigner.scala:16)
	dotty.tools.dotc.typer.Typer.assignType(Typer.scala:116)
	dotty.tools.dotc.ast.tpd$.Apply(tpd.scala:47)
	dotty.tools.dotc.ast.tpd$TreeOps$.appliedToTermArgs$extension(tpd.scala:957)
	dotty.tools.dotc.ast.tpd$.New(tpd.scala:543)
	dotty.tools.dotc.ast.tpd$.New(tpd.scala:534)
	dotty.tools.dotc.core.Annotations$Annotation$Child$.makeChildLater$1(Annotations.scala:234)
	dotty.tools.dotc.core.Annotations$Annotation$Child$.later$$anonfun$1(Annotations.scala:237)
	dotty.tools.dotc.core.Annotations$LazyAnnotation.tree(Annotations.scala:143)
	dotty.tools.dotc.core.Annotations$Annotation$Child$.unapply(Annotations.scala:245)
	dotty.tools.dotc.typer.Namer.insertInto$1(Namer.scala:476)
	dotty.tools.dotc.typer.Namer.addChild(Namer.scala:487)
	dotty.tools.dotc.typer.Namer$Completer.register$1(Namer.scala:931)
	dotty.tools.dotc.typer.Namer$Completer.registerIfChildInCreationContext$$anonfun$1(Namer.scala:940)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.typer.Namer$Completer.registerIfChildInCreationContext(Namer.scala:940)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:829)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:188)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:190)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:392)
	dotty.tools.dotc.typer.Typer.retrieveSym(Typer.scala:3067)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3092)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3206)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3277)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3281)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3303)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3349)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:2889)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3159)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3207)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3277)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3281)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3392)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$1(TyperPhase.scala:45)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:463)
	dotty.tools.dotc.typer.TyperPhase.typeCheck(TyperPhase.scala:51)
	dotty.tools.dotc.typer.TyperPhase.$anonfun$4(TyperPhase.scala:97)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:685)
	scala.collection.immutable.List$.from(List.scala:682)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:900)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:96)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:315)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1323)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:308)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:349)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:358)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:69)
	dotty.tools.dotc.Run.compileUnits(Run.scala:358)
	dotty.tools.dotc.Run.compileSources(Run.scala:261)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:161)
	dotty.tools.pc.CachingDriver.run(CachingDriver.scala:45)
	dotty.tools.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:31)
	dotty.tools.pc.SimpleCollector.<init>(PcCollector.scala:351)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:111)
```
#### Short summary: 

java.lang.AssertionError: assertion failed