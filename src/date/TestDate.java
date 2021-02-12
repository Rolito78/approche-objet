package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDate {
    public static void main(String[] args) throws ParseException {

        Date dateDuJour = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String dateTxt = simpleDateFormat.format(dateDuJour);

        System.out.println(dateTxt);

        Calendar calendar = Calendar.getInstance();

        calendar.set(2016, Calendar.MAY, 19, 23, 59, 30);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MMMMM/dd EEEE HH:mm:ss", new Locale("Ru", "ru"));

        String dateTxt2 = simpleDateFormat2.format(calendar.getTime());

        System.out.println(dateTxt2);
    }
}
