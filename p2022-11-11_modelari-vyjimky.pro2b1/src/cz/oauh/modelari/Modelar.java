package cz.oauh.modelari;

public class Modelar {
    private String jmeno;
    private int rokNarozeni;
    private String email;

    public Modelar(String jmeno, int rokNarozeni, String email) {
        this.jmeno = jmeno;
        this.rokNarozeni = rokNarozeni;
        this.email = email;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return this.jmeno;
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }

    public void setRokNarozeni(int rokNarozeni) {
        this.rokNarozeni = rokNarozeni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Modelar{" +
                "jmeno='" + jmeno + '\'' +
                ", rokNarozeni=" + rokNarozeni +
                ", email='" + email + '\'' +
                "}\n";
    }
}
