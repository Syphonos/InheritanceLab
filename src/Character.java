public class Character {
    public String CharName = "";
    public int Level = 0;
    public int HealthPoints = 150;
    public int Mana = 200;

    /* Created two Constructors that is a;
        1 - Non Parameterized Constructor
        2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
    */
    Character(){}
    Character(String name, int lvl, int hp, int mp){
        CharName = name;
        Level = lvl;
        HealthPoints = hp;
        Mana = mp;
    } 

    // Method for displaying the names of the characters //
    public void DisplayName(Character Name){
        System.out.println("\nCharacter -" + Name.CharName + "- Initialized");
    }

    // Method to Damage an enemy target //
    public void DamageTarget(Character EnCharacter, int DamagePoints, int ManaCost){
        EnCharacter.HealthPoints -= DamagePoints; // <---------- Detucting HP from the target character 
        System.out.println("Character has " + EnCharacter.HealthPoints + " HP Left\n");

        // Declaring Defeat if a Character reaches <= 0 HP //
        if (EnCharacter.HealthPoints <= 0){ 
            System.out.println(EnCharacter.CharName + " has been DEFEATED!!!\n");
        }
    }

    // Method to level up a certain character //
    public void LevelUp(Character name){
        name.Level += 10;
        System.out.println(name.CharName + " has leved up to 10!!!\n");
    }
}