package primeiroprojeto.DataHoraJava8Mais;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate semanaPassadaLocal = d04.minusDays(7);
        LocalDate proximaSemanaLocal = d04.plusDays(7);
        // Adiciona e subtrai (no exemplo dias) com minus e plus

        System.out.println("Current week = " + d04);
        System.out.println("Past Weeks = " + semanaPassadaLocal);
        System.out.println("Next Weeks = " + proximaSemanaLocal);
        System.out.println();

        LocalDateTime semanaPassadaTime = d05.minusDays(7);
        LocalDateTime proximaSemanaTime = d05.plusDays(7);
        // Adiciona e subtrai (no exemplo dias) com minus e plus

        System.out.println("Current week = " + d05);
        System.out.println("Past Weeks = " + semanaPassadaTime);
        System.out.println("Next Weeks = " + proximaSemanaTime);
        System.out.println();

        Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d06.plus(7, ChronoUnit.DAYS);
        // Adiciona e subtrai (no exemplo dias) com minus e plus + ChronoUnit

        System.out.println("Current week = " + d06);
        System.out.println("Past Weeks = " + semanaPassadaInstant);
        System.out.println("Next Weeks = " + proximaSemanaInstant);
        System.out.println();

        // Não tem como calcular uma duração entre dois LocalDate pois não tem o tempo
        // Precisa converter para LocalDateTime para fazer a operação
        // atTime(0, 0) ou at.StartOfDay();

        Duration t1 = Duration.between(semanaPassadaLocal.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(semanaPassadaTime, d05);
        Duration t3 = Duration.between(semanaPassadaInstant, d06);
        Duration t4 = Duration.between(d06, semanaPassadaInstant);

        System.out.println("t1 days = " + t1.toDays() + " days");
        System.out.println("t2 days = " + t2.toDays() + " days");
        System.out.println("t3 days = " + t3.toDays() + " days");
        System.out.println("t4 days = " + t4.toDays() + " days");

    }
}
