package JavaRush;

public class Artifact {
    int number;
    String kultura;
    int year;

    public Artifact(int number) {
        this.number = number;
    }
    public Artifact(int number, String kultura) {
        this.number = number;
        this.kultura = kultura;
    }

    public Artifact(int number, String kultura,int year) {
        this.number = number;
        this.kultura = kultura;
        this.year = year;
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(21221);
        Artifact artifact2 = new Artifact(3232,"Ацтеки");
        Artifact artifact3 = new Artifact(231231,"Ацтеки",12);
    }
}
