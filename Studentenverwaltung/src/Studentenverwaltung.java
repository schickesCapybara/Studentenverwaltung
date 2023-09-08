import java.util.*;
//fella
public class Studentenverwaltung {
    static Universitaet universitaet = new Universitaet();
    static List<Student> studentenListe = new ArrayList<>();

    public static void main(String[] args) {

        Student s1 = new Student();
        String nachname1 = "Schickedanz";
        String vorname1 = "Leonard";
        int matrikelnummer1 = 606725;
        String mail1 = "leon.schickedanz@gmail.com";
        Studiengang studiengang1 = universitaet.getStud1();
        s1.addStudent(nachname1, vorname1, matrikelnummer1, mail1, studiengang1);
        studentenListe.add(s1);

        Student s2 = new Student();
        nachname1 = "Max";
        vorname1 = "Mustermann";
        matrikelnummer1 = 6666;
        mail1 = "max.mustermann@gmail.com";
        studiengang1 = universitaet.getStud2();
        s2.addStudent(nachname1, vorname1, matrikelnummer1, mail1, studiengang1);
        studentenListe.add(s2);

        System.out.println("\nWillkommen zur Studentenvewaltung.");

        for (int w = 0; w < 100; w++) {
            line();
            System.out.println("Studenten hinzufügen. (1)");
            System.out.println("Note hinzufügen. (2)");
            System.out.println("Konsolenübersicht über einzelnen Studenten. (3)");
            System.out.println("Liste über alle Studenten ausgeben. (4)");
            line();
            Scanner sc = new Scanner(System.in);
            int antwort = sc.nextInt();

            switch (antwort) {
                case 1:
                    studentenHinzufuegen(sc);
                    break;
                case 2:
                    kursnoteHinzufuegen(sc);
                    break;
                case 3:
                    konsolenuebersichtGesamt(sc);
                    break;
                case 4:
                    listeAusgeben();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    public static void line() {
        System.out.println("-----------------------");
    }

    public static void print(int i, String name) {
        System.out.println(i + ": " + name);
    }

    public static void studentenHinzufuegen(Scanner sc) {
        System.out.println("Nachname:");
        sc.nextLine();
        String nachname = sc.nextLine();
        System.out.println("Vorname:");
        String vorname = sc.nextLine();
        System.out.println("Matrikelnummer:");
        int matrikelnummer = sc.nextInt();
        System.out.println("E-Mail:");
        sc.nextLine();
        String mail = sc.nextLine();

        line();
        print(1, universitaet.getStud1().getName());
        print(2, universitaet.getStud2().getName());
        print(3, universitaet.getStud3().getName());

        System.out.println("Wählen Sie einen Studiengang für den Studenten aus. (1,2,3)");
        int antwort2 = sc.nextInt();
        Student neuerStudent = new Student();
        if (antwort2 <= 0 || antwort2 > 3) {
            System.out.println("Bitte eine Zahl zwischen 1-3.");
            studentenHinzufuegen(sc);
        } else {
            Studiengang studiengang;
            if (antwort2 == 1) {
                studiengang = universitaet.getStud1();
            } else if (antwort2 == 2) {
                studiengang = universitaet.getStud2();
            } else {
                studiengang = universitaet.getStud3();
            }
            neuerStudent.addStudent(nachname, vorname, matrikelnummer, mail, studiengang);
            studentenListe.add(neuerStudent);
            System.out.println("Sie haben den Studenten erfolgreich hinzugefügt.");
        }
    }

    public static void kursnoteHinzufuegen(Scanner sc) {
        if (studentenListe.size() > 0) {
            for (int i = 0; i < studentenListe.size(); i++) {
                System.out.println("(" + (i + 1) + ") " + studentenListe.get(i).toString());
            }
            line();
            System.out.println("Bitte wählen Sie einen Studenten aus der Liste.");
            int student = sc.nextInt() - 1;

            System.out.println("Für welchen Kurs möchten Sie eine Note eintragen?");
            if (!studentenListe.get(student).getStudiengang().equals(universitaet.getStud1())) {
                print(1, studentenListe.get(student).getStudiengang().getKurs1().getName());
                print(2, studentenListe.get(student).getStudiengang().getKurs2().getName());
            } else {
                print(1, studentenListe.get(student).getStudiengang().getKurs1().getName());
                print(2, studentenListe.get(student).getStudiengang().getKurs2().getName());
                print(3, studentenListe.get(student).getStudiengang().getKurs3().getName());
            }
            int antwort4 = sc.nextInt();
            int eingegebeneNote;
            switch (antwort4) {
                case 1:
                    System.out.println("Bitte geben Sie die Note ein.");
                    eingegebeneNote = sc.nextInt();
                    if (studentenListe.get(student).getStudiengang().getKurs1().getNote() != 0) {
                        System.out.println("Für diesen Kurs wurde bereits eine Note hinzugefügt.");
                        break;
                    } else {
                        studentenListe.get(student).getStudiengang().getKurs1().setNote(eingegebeneNote);
                        System.out.println("Note erfolgreich hinzugefügt.");
                    }
                    break;
                case 2:
                    System.out.println("Bitte geben Sie die Note ein.");
                    eingegebeneNote = sc.nextInt();
                    if (studentenListe.get(student).getStudiengang().getKurs2().getNote() != 0) {
                        System.out.println("Für diesen Kurs wurde bereits eine Note hinzugefügt.");
                        break;
                    } else {
                        studentenListe.get(student).getStudiengang().getKurs2().setNote(eingegebeneNote);
                        System.out.println("Note erfolgreich hinzugefügt.");
                    }
                    break;
                case 3:
                    System.out.println("Bitte geben Sie die Note ein.");
                    eingegebeneNote = sc.nextInt();
                    if (studentenListe.get(student).getStudiengang().getKurs3().getNote() != 0) {
                        System.out.println("Für diesen Kurs wurde bereits eine Note hinzugefügt.");
                        break;
                    } else {
                        studentenListe.get(student).getStudiengang().getKurs3().setNote(eingegebeneNote);
                        System.out.println("Note erfolgreich hinzugefügt.");
                    }
                    break;
                default:
                    System.out.println("Error 4");
                    break;
            }
        } else {
            System.out.println("Sie müssen zuerst einen Studenten hinzufügen, bevor Sie eine Kursnote hinzufügen können.");
            line();
        }
    }

    public static void konsolenuebersichtGesamt(Scanner sc) {
        if (studentenListe.size() > 0) {
            int z;
            for (z = 0; z < studentenListe.size(); z++) {
                System.out.println("(" + (z + 1) + ") " + studentenListe.get(z).toString());
            }
            System.out.println("Bitte wählen Sie einen Studenten.");
            int antwort4 = sc.nextInt();
            notenrechner(antwort4 - 1);
        } else {
            System.out.println("Sie müssen zuerst einen Studenten hinzufügen, bevor Sie die Konsolenübersicht öffnen können.");
        }
    }

    public static void listeAusgeben() {
        if (studentenListe.size() > 0) {
            int x;
            for (x = 0; x < studentenListe.size(); x++) {
                System.out.println((x + 1) + ": " + studentenListe.get(x));
            }
            System.out.println();
        } else {
            System.out.println("Sie müssen zuerst einen Studenten hinzufügen, bevor Sie die Konsolenübersicht öffnen können.");
        }
    }

    public static void uebersichtStudent(Student student) {
        System.out.println("\nName: " + student.getVorname() + " " + student.getNachname());
        System.out.println("Fach: " + student.getStudiengang().getName());
        System.out.println("Matrikelnummer: " + student.getMatrikelnummer());
        System.out.println("E-Mail: " + student.getMail());
        System.out.println("\n--- Prüfungen ---");
        uebersichtKurse(student.getStudiengang().getKurs1(), student.getStudiengang().getKurs1().getCredits(), student.getStudiengang().getKurs1().getMultiplikator(), student.getStudiengang().getKurs1().getNote());
        uebersichtKurse(student.getStudiengang().getKurs2(), student.getStudiengang().getKurs2().getCredits(), student.getStudiengang().getKurs2().getMultiplikator(), student.getStudiengang().getKurs2().getNote());
        if (student.getStudiengang().getAnzahlKurse() == 3) {
            uebersichtKurse(student.getStudiengang().getKurs3(), student.getStudiengang().getKurs3().getCredits(), student.getStudiengang().getKurs3().getMultiplikator(), student.getStudiengang().getKurs3().getNote());
        }
        if (student.getGesamtnote() != 0) {
            System.out.println("Gesamtnote: " + student.getGesamtnote());
        } else {
            System.out.println("Gesamtnote: ");
        }
    }

    public static void notenrechner(int o) {
        double a = studentenListe.get(o).getStudiengang().getKurs1().getNote();
        double b = studentenListe.get(o).getStudiengang().getKurs2().getNote();
        double c = studentenListe.get(o).getStudiengang().getKurs3().getNote();
        int d = studentenListe.get(o).getStudiengang().getKurs1().getMultiplikator();
        int e = studentenListe.get(o).getStudiengang().getKurs2().getMultiplikator();
        int f = studentenListe.get(o).getStudiengang().getKurs3().getMultiplikator();
        studentenListe.get(o).setGesamtnote(((a * d) * (b * e) * (c * f)) / (studentenListe.get(o).getStudiengang().getAnzahlKurse()));
        uebersichtStudent(studentenListe.get(o));
    }

    public static void uebersichtKurse(Kurs kurs, int credit, int multiplikator, double note) {
        System.out.println("Name: " + kurs.getName());
        System.out.println("Credits: " + credit);
        System.out.println("Multiplikator: " + multiplikator);
        if (note != 0) {
            System.out.println("Note: " + note);
        } else {
            System.out.println("Note: ");
        }
        System.out.println("-- --");
    }
}
