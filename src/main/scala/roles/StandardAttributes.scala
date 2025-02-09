package roles

import attributes._

class StandardAttributes(
    var health: Health = 100,
    var attack: Attack = (100, 100),
    var speed: Speed = 100,
    var mage: Mage = (100, 100)
) extends ConfigureHealth
    with ConfigureAttack
    with ConfigureMage
    with ConfigureSpeed {
  override def setHealth(health: Health): Unit = {
    this.health = health
  }
  override def setAttack(attack: Attack): Unit = {
    this.attack = attack
  }
  override def setMage(attack: Mage): Unit = {
    this.mage = mage
  }
  override def setSpeed(attack: Speed): Unit = {
    this.speed = speed
  }
  override def getHealth(): Health = this.health
  override def getAttack(): Attack = this.attack
  override def getMage(): Mage = this.mage
  override def getSpeed(): Speed = this.speed
}
