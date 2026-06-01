package Composition.Composite;

public class Puppy implements Labrador{
    private final Color color;
    private final String name;
    private final Gender gender;

    public Puppy(Color color, String name, Gender gender) {
        this.color = color;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void bark() {
        System.out.println(this.name + ": Purrr~");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Gender getGender() {
        return this.gender;
    }
}
