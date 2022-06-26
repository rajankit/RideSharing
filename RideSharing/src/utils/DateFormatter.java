package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    private String date;
    public DateFormatter(String date) {
        this.date = date;
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
        return formatter.parse(this.date);
    }

    public void setDate(String date) {
        this.date = date;
    }
}
