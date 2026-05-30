public class Slytherin implements House{

    private String headName;

    public Slytherin(){
        this.headName = "Severus Snape";
    }

    @Override
    public String getHeadOfHouse() {
        return headName;
    }

    @Override
    public void changeHeadOfHouse(String newHead) {
        this.headName = newHead;
        System.out.println("According to the order of the Ministry of Magic, " +
                "the new head of Slytherin is " + this.headName);
    }
}
