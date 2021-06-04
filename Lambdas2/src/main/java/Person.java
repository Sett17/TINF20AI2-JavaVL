import java.util.Objects;

public class Person {
    private String vorname;
    private String nachname;
    private int alter;

//    @Override
//    public String toString() {
//        return "Person{" +
//                "vorname='" + vorname + '\'' +
//                ", nachname='" + nachname + '\'' +
//                ", alter=" + alter +
//                '}';
//    }


    @Override
    public String toString() {
        return "\u001B[7m" + vorname + " " + nachname + " : " + alter + "\u001B[0m";
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Person(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAlter() == person.getAlter() && Objects.equals(getVorname(), person.getVorname()) && Objects.equals(getNachname(), person.getNachname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVorname(), getNachname(), getAlter());
    }
}
