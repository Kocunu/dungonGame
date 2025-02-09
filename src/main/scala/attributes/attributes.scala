package attributes

type Health = Int
type Attack = (Double, Double)
type Mage = (Double, Double)
type Speed = Int

enum Skills(val damage: Int):
  case SwordSwing extends Skills(120)
  case Fireball extends Skills(120)

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
