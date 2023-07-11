import java.util.TimeZone;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Get the default time zone
        TimeZone timeZone = TimeZone.getDefault();

        // Print the time zone ID and display name
        System.out.println("Time zone ID: " + timeZone.getID());
        System.out.println("Time zone display name: " + timeZone.getDisplayName());

        // Set the time zone to a specific ID
        TimeZone losAngelesTimeZone = TimeZone.getTimeZone("America/Los_Angeles");
        timeZone = losAngelesTimeZone;

        // Print the time zone ID and display name again
        System.out.println("Time zone ID: " + timeZone.getID());
        System.out.println("Time zone display name: " + timeZone.getDisplayName());
    }
}