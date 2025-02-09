package roles

import attributes._

class Warior(
    var health: Health,
    var attack: Attack,
    var speed: Speed,
    var mage: Mage
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
  override def getHealth(): Health = this.health
  override def getMage(): Mage = this.mage
  override def getSpeed(): Speed = this.speed
}
