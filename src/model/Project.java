package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.3 LesEenheid
 * <p>
 * Doel     Class Project. Subclass van LesEenheid.
 */
public class Project extends LesEenheid {
    public double productCijfer;
    public double procesCijfer;
    public double methodenEnTechniekenCijfer;

    public Project(double productCijfer, double procesCijfer, double methodenEnTechniekenCijfer,
                   String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.productCijfer = productCijfer;
        this.procesCijfer = procesCijfer;
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }

    public Project(String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
    }

    public boolean isAfgerond() {
        return false;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " (%.1f, %.1f, %.1f)",
                productCijfer, procesCijfer, methodenEnTechniekenCijfer);
    }

    public void setProductCijfer(double productCijfer) {
        this.productCijfer = productCijfer;
    }

    public void setProcesCijfer(double procesCijfer) {
        this.procesCijfer = procesCijfer;
    }

    public void setMethodenEnTechniekenCijfer(double methodenEnTechniekenCijfer) {
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }
}
