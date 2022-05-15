public class Warlock extends Character{
    Warlock(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }

    // Skills of the Warlock //
    public void SnakeBite(Character EnCharacter){
        System.out.println(super.CharName + " attacked " + EnCharacter.CharName + " using Snake Bite (Damage - 50) (Mana - 50)");
        int DamagePoints = 50;
        int ManaCost = 50;
        DamageTarget(EnCharacter, DamagePoints, ManaCost);
    }
    public void Devour(Character EnCharacter){
        System.out.println(super.CharName + " attacked " + EnCharacter.CharName + " using Devour (Damage - 65) (Mana - 90)");
        int DamagePoints = 65;
        int ManaCost = 90;
        DamageTarget(EnCharacter, DamagePoints, ManaCost);
    }

    // Regen of the Warlock //
    public void Restore(Character enemyCharacter){
        super.HealthPoints += 50;
        super.Mana += 75;
        System.out.println(enemyCharacter.CharName + "Healing Back Up!!!\n");
    }
    
    // Method that displays the Character Data of Warlock //
    public void DisplayCD(){
        System.out.println("Warlock: " + super.CharName);
        System.out.println("HealthPoints: " + super.HealthPoints);
        System.out.println("ManaPoints: " + super.Mana);
        System.out.println("Level " + super.Level);
    }
}