public class Wizard extends Character{
    Wizard(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }

    // Skill of the Wizard //
    public void BladeStorm(Character EnemyCharacter){
        System.out.println(super.CharName + " attacked " + EnemyCharacter.CharName + " using Blade Storm (Damage - 55) (Mana - 50)");
        int DamagePoints = 55 ; 
        int ManaCost = 50 ;
        DamageTarget(EnemyCharacter, DamagePoints, ManaCost);
    }
    public void Aftershock(Character EnemyCharacter){
        System.out.println(super.CharName + " attacked " + EnemyCharacter.CharName + " using Aftershock (Damage - 60) (Mana - 90)");
        int DamagePoints = 60 ; 
        int ManaCost = 90;
        DamageTarget(EnemyCharacter, DamagePoints, ManaCost);
    }

    // Regen of the Wizard //
    public void Recharge(Character EnemyCharacter){
        super.HealthPoints += 50;
        super.Mana += 75;
        System.out.println(EnemyCharacter.CharName + " is Recharging!!!\n");
    }
    
    // Method that displays the Character Data of Wizard //
    public void DisplayCD(){
        System.out.println("Wizard: " + super.CharName);
        System.out.println("HealthPoints: " + super.HealthPoints);
        System.out.println("ManaPoints: " + super.Mana);
        System.out.println("Level " + super.Level);
    }
}