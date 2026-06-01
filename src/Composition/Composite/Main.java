package Composition.Composite;

public class Main {
    public static void main(String[] args) {

        // Color of a Labrador
        Labrador grandpa = new Puppy(Color.black, "Pete", Gender.Male);
        System.out.println(grandpa.getName() + " is a " +
                (grandpa.getGender() == Gender.Male? "male" : "female") + " puppy in " +
                grandpa.getColor().name());

        // Composite family tree
        // First generation, Emma
        Mom grandma = new Mom(Color.gold, "Emma");
        // Second generation, Emma's puppy Lisa
        Mom lisa = new Mom(Color.yellow, "Lisa");
        // Second generation, Emma's puppy Minerva
        Mom minerva = new Mom(Color.gold, "Minerva");
        // Second generation, Emma's puppy Roy, but he can not give birth, he is male!
        Puppy roy = new Puppy(Color.yellow,"Roy", Gender.Male);
        // Third generation, Lisa's puppy Shannon
        Mom shannon = new Mom(Color.chocolate, "Shannon");
        // Third generation, Lisa's puppy Eric, he cannot give birth!
        Puppy eric= new Puppy(Color.black,"Eric", Gender.Male);
        // Third generation, Minerva's puppy Matt, he cannot give birth!
        Puppy matt= new Puppy(Color.gold,"Matt", Gender.Male);
        // Fourth generation, Shannon's puppy Paul, he cannot give birth!
        Puppy paul= new Puppy(Color.black,"Paul", Gender.Male);
        // Fourth generation, Shannon's puppy Scarlett, she can give birth, but she does not want to!
        Puppy scarlett= new Puppy(Color.black,"Scarlett", Gender.Female);
        // Give birth
        grandma.giveBirth(lisa);
        grandma.giveBirth(minerva);
        grandma.giveBirth(roy);
        lisa.giveBirth(shannon);
        lisa.giveBirth(eric);
        minerva.giveBirth(matt);
        shannon.giveBirth(paul);
        shannon.giveBirth(scarlett);
        // Let the festival begin!
        grandma.bark();
    }
}
