package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.3 LesEenheid
 * <p>
 * Doel     Class LesEenheid. Superclass van Vak, ProfessionalSkills en Project
 */
public class LesEenheid {
    public String naam;     // Naam leseenheid
    public int ects;        // aantal te behalen ects (European Credits, synoniem voor studiepunten)
    public int studiejaar;  // Studiejaar (1, 2, 3 of 4)

    public LesEenheid(String naam, int ects, int studiejaar) {
        this.naam = naam;
        this.ects = ects;
        this.studiejaar = studiejaar;
    }

    @Override
    public String toString() {
        return String.format("%s, %d ects, studiejaar %d", naam, ects, studiejaar);
    }
}
