package controller;

import model.LesEenheid;
import model.ProfessionalSkills;
import model.Project;
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
        Vak nogEenVak = new Vak("Databases", 3, 1);
        System.out.println(nogEenVak.toString() + ", afgerond: " +
                nogEenVak.isAfgerond());
        nogEenVak.setCijfer(5.499999);
        System.out.println(nogEenVak.toString() + ", afgerond: " +
                nogEenVak.isAfgerond());
        nogEenVak.setCijfer(5.5);
        System.out.println(nogEenVak.toString() + ", afgerond: " +
                nogEenVak.isAfgerond());
        ProfessionalSkills nogEenSkill = new ProfessionalSkills("ICT Ethics", 2, 2 );
        System.out.println(nogEenSkill.toString() + ", afgerond: " +
                nogEenSkill.isAfgerond());
        nogEenSkill.setGehaald(true);
        System.out.println(nogEenSkill.toString() + ", afgerond: " +
                nogEenSkill.isAfgerond());
        Project nogEenProject = new Project("Agile Development", 12, 1);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
        nogEenProject.setMethodenEnTechniekenCijfer(5.499999);
        nogEenProject.setProcesCijfer(5.5);
        nogEenProject.setProductCijfer(5.5);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
        nogEenProject.setMethodenEnTechniekenCijfer(5.5);
        nogEenProject.setProcesCijfer(5.4999999);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
        nogEenProject.setProcesCijfer(10);
        nogEenProject.setProductCijfer(5.499999);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
        nogEenProject.setProductCijfer(10);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
        nogEenProject.setMethodenEnTechniekenCijfer(10);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
    }
}
