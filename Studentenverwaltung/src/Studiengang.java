public class Studiengang {
    private String name;
    private String kurs;
    private int anzahlKurse;
    private Kurs kurs1 = new Kurs();
    Kurs kurs2 = new Kurs();
    Kurs kurs3 = new Kurs();

    public String getKurs() {
        return kurs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKurs1(Kurs kurs1) {
        this.kurs1 = kurs1;
    }

    public void setKurs2(Kurs kurs2) {
        this.kurs2 = kurs2;
    }

    public void setKurs3(Kurs kurs3) {
        this.kurs3 = kurs3;
    }

    public String getName() {
        return name;
    }

    public Kurs getKurs1() {
        return kurs1;
    }

    public Kurs getKurs2() {
        return kurs2;
    }

    public Kurs getKurs3() {
        return kurs3;
    }

    public int getAnzahlKurse() {
        return anzahlKurse;
    }

    public void setAnzahlKurse(int anzahlKurse) {
        this.anzahlKurse = anzahlKurse;
    }

    public Studiengang() {
        Studiengang stud1;
        Studiengang stud2;
        Studiengang stud3;
    }
}
