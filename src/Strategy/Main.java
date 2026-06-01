package Strategy;

public class Main {
    public static void main(String[] args) {
        String favoriteProf = new Gryffindor().getHeadOfHouse();

        // Will print the name Minerva McGonagall
        System.out.println("My favorite prof is " + favoriteProf);
    }
}