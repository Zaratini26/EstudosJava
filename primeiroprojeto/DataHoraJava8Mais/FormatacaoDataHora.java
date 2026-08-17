package primeiroprojeto.DataHoraJava8Mais;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatacaoDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2026-07-20T01:30:25");
        Instant d06 = Instant.parse("2026-07-20T01:30:25Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // formata customizado o horário local data

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // formata customizado o horário local data/hora

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        // formata customizado o horário global para data/hora do sistema padrão da máquina onde rodar
        // Instant tranforma pra z time (London) e o withZone(ZoneId) trouxe pro horário de GMT-3 (SP)

        DateTimeFormatter fm4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fm5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d06 = " + fmt3.format(d06));

        System.out.println();
        System.out.println("d05 = " + fm4.format(d05));
        System.out.println("d06 = " + fm5.format(d06));
    }
}
