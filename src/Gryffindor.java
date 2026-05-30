public class Gryffindor implements House{

    private String headName;

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
        System.out.println("According to the order of the Ministry of Magic, " +
                "the new head of Gryffindor is" + this.headName);
    }
}
