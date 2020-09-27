package controller;

import model.LesEenheid;
import model.Vak;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.3 LesEenheid
 * <p>
 * Doel     Creeër een OOP applicatie voor vier Classes die met elkaar samenwerken. Thema is LesEenheid, waarbij
 *          een relatie is tot : Vak, ProfessionalSkills en Project.
 */
public class LesEenheidLauncher {
    public static void main(String[] args) {
        LesEenheid lesEenheid = new LesEenheid("Algemeen", 3 , 2);
        System.out.println(lesEenheid);

        Vak vak = new Vak(7.8, "OOP1", 3 , 1);
        System.out.println(vak);
    }
}
