public class Gryffindor implements House{

    private String headName;
    private final String houseName = "Gryffindor";

    public Gryffindor(){
        this.headName = "Minerva McGonagall";
    }

    @Override
    public String getHeadOfHouse() {
        return headName;
    }

    @Override
    public void changeHeadOfHouse(String newHead) {
        this.headName = newHead;
        System.out.println("According to the order of the Ministry of Magic, the new head of " +
                this.houseName + "is " + this.headName);
    }

    public String getHouseName() {
        return this.houseName;
    }
}
