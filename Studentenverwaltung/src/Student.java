public class Student {
    private double gesamtnote;
    private String nachname;
    private String vorname;
    private int matrikelnummer;
    private String mail;

    @Override
    public String toString() {
        return vorname + " " + nachname + " (" + matrikelnummer + ")";
    }

    public void setStudiengang(Studiengang studiengang) {
        this.studiengang = studiengang;
    }

    public double getGesamtnote() {
        return gesamtnote;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getMail() {
        return mail;
    }

    public Studiengang getStudiengang() {
        return studiengang;
    }

    Studiengang studiengang = new Studiengang();

    public void setGesamtnote(double gesamtnote) {
        this.gesamtnote = gesamtnote;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void addStudent(String nachname, String vorname, int matrikelnummer, String mail, Studiengang studiengang) {
        setNachname(nachname);
        setVorname(vorname);
        setMatrikelnummer(matrikelnummer);
        setMail(mail);
        setStudiengang(studiengang);
    }
}
