package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.3 LesEenheid
 * <p>
 * Doel     Class ProfessionalSkills. Subclass van LesEenheid.
 */
public class ProfessionalSkills extends LesEenheid {
    public boolean gehaald;

    public ProfessionalSkills(boolean gehaald, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.gehaald = gehaald;
    }

    public ProfessionalSkills(String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
    }

    public boolean isAfgerond() {
        return false;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", %s", (gehaald) ? "gehaald" : "niet gehaald");
    }

    public void setGehaald(boolean gehaald) {
        this.gehaald = gehaald;
    }
}
