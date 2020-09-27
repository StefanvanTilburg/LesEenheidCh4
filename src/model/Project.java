package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.3 LesEenheid
 * <p>
 * Doel     Class Project. Subclass van LesEenheid.
 */
public class Project extends LesEenheid {
    private double productCijfer;
    private double procesCijfer;
    private double methodenEnTechniekenCijfer;

    public Project(double productCijfer, double procesCijfer, double methodenEnTechniekenCijfer,
                   String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.setProductCijfer(productCijfer);
        this.setProcesCijfer(procesCijfer);
        this.setMethodenEnTechniekenCijfer(methodenEnTechniekenCijfer);
    }

    public Project(String naam, int ects, int studiejaar) {
        this(DEFAULT_DOUBLE_WAARDE, DEFAULT_DOUBLE_WAARDE, DEFAULT_DOUBLE_WAARDE, naam, ects, studiejaar);
    }

    public Project() {
        this(DEFAULT_NAAM, DEFAULT_INT_WAARDE, DEFAULT_INT_WAARDE);
    }

    public boolean isAfgerond() {
        return (this.productCijfer >= ONDERGRENS_VOLDOENDE &&
                this.procesCijfer >= ONDERGRENS_VOLDOENDE &&
                this.methodenEnTechniekenCijfer >= ONDERGRENS_VOLDOENDE);
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
