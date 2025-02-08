package object attributes {
    type Health = Int
    type Attack = (Double,Double)
    type Mage = (Double,Double)
    type Speed = Int

    trait configureHealth {
        def setHealth(health: attributes.Health): attributes.Health
        def getHealth(health: attributes.Health): attributes.Health
    }

    trait configureAttack {
        def setAttack(attack: attributes.Attack): attributes.Attack
        def getAttack(attack: attributes.Attack): attributes.Attack
    }

    trait configureMage {
        def setMage(attack: attributes.Mage): attributes.Mage
        def getMage(attack: attributes.Mage): attributes.Mage
    }

    trait configureSpeed {
        def setSpeed(attack: attributes.Speed): attributes.Speed
        def getSpeed(attack: attributes.Speed): attributes.Speed
    }
}
