package primeiroprojeto.DataHoraJava8Menos;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalculosDataHora {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("Data/Hora inicial cadastrada: \n" + sdf.format(d1));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);

        System.out.println("-".repeat(20));
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minutes = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        int year = cal.get(Calendar.YEAR);
        int month = 1 + cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);


        System.out.println("Hour = " + hour);
        System.out.println("Minutes = " + minutes);
        System.out.println("Second = " + second);

        System.out.println("-".repeat(20));
        System.out.println("Day = " + day);
        System.out.println("Month = " + month);
        System.out.println("Year = " + year);

        cal.add(Calendar.DAY_OF_MONTH, 3);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d1 = cal.getTime();

        System.out.println("Adicionado 4 Horas e 3 dias = " + sdf.format(d1));
    }
}
