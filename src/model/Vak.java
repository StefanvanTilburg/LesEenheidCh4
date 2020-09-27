package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.3 LesEenheid
 * <p>
 * Doel     Class Vak. Subclass van LesEenheid.
 */
public class Vak extends LesEenheid {
    public double cijfer;

    public Vak(double cijfer, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.cijfer = cijfer;
    }

    public Vak(String naam, int ects, int studiejaar) {
        this(DEFAULT_DOUBLE_WAARDE, naam, ects, studiejaar);
    }

    public Vak() {
        this(DEFAULT_NAAM, DEFAULT_INT_WAARDE, DEFAULT_INT_WAARDE);
    }

    public boolean isAfgerond() {
        return this.cijfer >= ONDERGRENS_VOLDOENDE;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", cijfer %.1f", cijfer);
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }
}
