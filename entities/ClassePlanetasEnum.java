package entities;

import entities.enums.EnumPlanetas;

public class ClassePlanetasEnum {
    EnumPlanetas planetas;

    public ClassePlanetasEnum(String planetas) {
        try {
            this.planetas = EnumPlanetas.valueOf(planetas);
        } catch (IllegalArgumentException e) {
            System.err.println("Planeta Inválido! Definindo Terra como padrão");
            this.planetas = EnumPlanetas.TERRA;
        }
    }

    public void viajarPlanetas() {
        switch (this.planetas) {
            case MERCURIO:
                System.out.println("Muito quente por lá");
                break;
            case TERRA:
                System.out.println("Já estamos na Terra!");
                break;
            case URANO:
                System.out.println("Muito longe!");
                break;
            default:
                System.out.println("Passagens Esgotadas!");
                break;
        }
    }
}
