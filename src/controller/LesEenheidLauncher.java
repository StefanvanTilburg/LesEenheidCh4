package controller;

import model.LesEenheid;

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
    }
}
