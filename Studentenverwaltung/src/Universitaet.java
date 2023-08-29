public class Universitaet {
    private String name;

    private Studiengang studiengang = new Studiengang();
    private Studiengang stud1 = new Studiengang();
    private Studiengang stud2 = new Studiengang();
    private Studiengang stud3 = new Studiengang();

    public void setName(String name) {
        this.name = name;
    }

    public void setStudiengang(Studiengang studiengang) {
        this.studiengang = studiengang;
    }

    public void setStud1(Studiengang stud1) {
        this.stud1 = stud1;
    }

    public void setStud2(Studiengang stud2) {
        this.stud2 = stud2;
    }

    public void setStud3(Studiengang stud3) {
        this.stud3 = stud3;
    }

    public String getName() {
        return name;
    }

    public Studiengang getStudiengang() {
        return studiengang;
    }

    public Studiengang getStud1() {
        return stud1;
    }

    public Studiengang getStud2() {
        return stud2;
    }

    public Studiengang getStud3() {
        return stud3;
    }

    public Universitaet() {
        name = "Universität Regensburg";

        stud1.setName("Wirtschafsinformatik (Bachelor)");
        stud1.getKurs1().setName("Programmieren 1");
        stud1.getKurs1().setCredits(4);
        stud1.getKurs1().setMultiplikator(1);
        stud1.getKurs2().setName("Programmieren 2");
        stud1.getKurs2().setCredits(4);
        stud1.getKurs2().setMultiplikator(2);
        stud1.getKurs3().setName("BWL");
        stud1.getKurs3().setCredits(5);
        stud1.getKurs3().setMultiplikator(2);
        stud1.setAnzahlKurse(3);

        stud2.setName("Wirtschaftsinformatik (Master)");
        stud2.getKurs1().setName("Moderne Datenbankkonzepte");
        stud2.getKurs1().setCredits(6);
        stud2.getKurs1().setMultiplikator(2);
        stud2.getKurs2().setName("Business Consulting");
        stud2.getKurs2().setCredits(6);
        stud2.getKurs2().setMultiplikator(2);
        stud2.setAnzahlKurse(2);

        stud3.setName("Allgmeine Informatik (Bachelor)");
        stud3.getKurs1().setName(stud1.getKurs1().getName());
        stud3.getKurs1().setCredits(4);
        stud3.getKurs1().setMultiplikator(1);
        stud3.getKurs2().setName(stud1.getKurs2().getName());
        stud3.getKurs2().setCredits(4);
        stud3.getKurs2().setMultiplikator(2);
        stud3.setAnzahlKurse(2);
    }
}
