public class Hufflepuff implements House{
    private String headName;

    public Hufflepuff(){
        this.headName = "Pomona Sprout";
    }

    @Override
    public String getHeadOfHouse() {
        return headName;
    }

    @Override
    public void changeHeadOfHouse(String newHead) {
        this.headName = newHead;
        System.out.println("According to the order of the Ministry of Magic, " +
                "the new head of Hufflepuff is " + this.headName);
    }
}
