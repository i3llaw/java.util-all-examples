import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        // Get the default locale
        Locale locale = Locale.getDefault();

        // Print the locale language, country, and display name
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Locale display name: " + locale.getDisplayName());

        // Set the locale to a specific language and country
        Locale frenchLocale = new Locale("fr", "FR");
        locale = frenchLocale;

        // Print the locale language, country, and display name again
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Locale display name: " + locale.getDisplayName());
    }
}