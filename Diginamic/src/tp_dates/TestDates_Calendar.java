package tp_dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates_Calendar {

    public static void main(final String[] args) {
        final Date today = new Date();
        System.out.println("Date du jour: " + today);

        final String pattern = "dd-MM-yyyy";
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        final String newDate = simpleDateFormat.format(new Date());
        System.out.println("Date formatté: " + newDate);

        final Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.MONTH, 04);
        c1.set(Calendar.DAY_OF_MONTH, 18);
        c1.set(Calendar.YEAR, 2016);
        c1.set(Calendar.HOUR_OF_DAY, 23);
        c1.set(Calendar.MINUTE, 59);
        c1.set(Calendar.SECOND, 30);
        final Date defineDate = c1.getTime();

        System.out.println("Heure défini: " + defineDate);
    }
}
