package exersices.firstWeek.exercises;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static enums.DataTimeFormat.AM_PM_FORMAT;
import static enums.DataTimeFormat.MILITARY_FORMAT;

public class TimeConversion {

    public String timeConverter(String time) {
        DateFormat inputFormat = new SimpleDateFormat(AM_PM_FORMAT.getFormat());
        DateFormat outputFormat = new SimpleDateFormat(MILITARY_FORMAT.getFormat());

        Date formatted = null;
        try {
            formatted = inputFormat.parse(time);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        return outputFormat.format(formatted);
    }
}
