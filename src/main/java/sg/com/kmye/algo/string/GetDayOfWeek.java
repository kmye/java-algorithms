package sg.com.kmye.algo.string;

import java.util.Calendar;

public class GetDayOfWeek {

    String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public String dayOfTheWeek(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH ,month-1);

        return dayOfWeek[calendar.get(Calendar.DAY_OF_WEEK)-1];
    }

}
