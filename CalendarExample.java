import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        // Create a Calendar object for a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JULY, 11);

        // Print the day of the week for the date
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week: " + getDayOfWeekString(dayOfWeek));
    }

    public static String getDayOfWeekString(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                return "Sunday";
            case Calendar.MONDAY:
                return "Monday";
            case Calendar.TUESDAY:
                return "Tuesday";
            case Calendar.WEDNESDAY:
                return "Wednesday";
            case Calendar.THURSDAY:
                return "Thursday";
            case Calendar.FRIDAY:
                return "Friday";
            case Calendar.SATURDAY:
                return "Saturday";
            default:
                return "";
        }
    }
}