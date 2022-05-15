public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
        /**
        * Create a Wizard Class which Inherits the Properties of Character Class.
        * eg. Wizard.java
        * 
        * 
        * Create a Warlock Class which Inherits the Properties of Character Class.
        * eg. Warlock.java
        * 
        * Each of the above mentioned Classes should have the following:
        * 1 - 2 Damage Spells(you are free to name it)
        * - each method/spell should invoke the damageTarget method from Character
        * and has its corresponding mana cost and damage points
        * 2 - 1 Recover spell(you are free to name it) that will increase both HP and Mana Points
        * 
        */

        /**
        * Create a Sequence of each Character Created Casting Spells until
        * one of the Characters Created gets defeated.
        * 
        * The sequence should contain the following:
        * 1 - Damaging the Opposing Character.
        * 2 - Both Characters will Damage each other.
        * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
        * 4 - "Recover spell" has no Mana Point Cost
        * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
        * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
        * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
        *      - Create a method to display details for better readability
        */

        /**
        * Example Sequence
        * Wizard Merlin = new Wizard("Merlin");
        * Warlock Saruman = new Warlock("Saruman");
        * 
        * Merlin.firestorm(Saruman); // Saruman HP Deducted
        * Warlock.recover() // Saruman HP and MP increases
        */
        Wizard Doctor_Strange = new Wizard("Doctor Strange",1,150,200);
        Warlock Scarlet_Witch = new Warlock("Scarlet Witch",1,150,200);
        
        Doctor_Strange.DisplayName(Doctor_Strange);
        Scarlet_Witch.DisplayName(Scarlet_Witch);
        System.out.println("\nLet the Battle Begin!!!\n");
        Doctor_Strange.BladeStorm(Scarlet_Witch);
        Scarlet_Witch.SnakeBite(Doctor_Strange);
        Doctor_Strange.Aftershock(Scarlet_Witch);
        Scarlet_Witch.Devour(Doctor_Strange);
        Doctor_Strange.Recharge(Doctor_Strange);
        Scarlet_Witch.SnakeBite(Doctor_Strange);
        Doctor_Strange.BladeStorm(Scarlet_Witch);
        Doctor_Strange.LevelUp(Doctor_Strange);
    }
}