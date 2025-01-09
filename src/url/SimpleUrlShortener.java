package url;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleUrlShortener {

    // A simple in-memory map to store the mapping of short URLs to long URLs
    private Map<String, String> urlMap = new HashMap<>();

    // Method to generate a short URL from a long URL
    public String shortenUrl(String longUrl) {
        // Generate a hash code from the URL
        int hashCode = longUrl.hashCode();
        // Convert the hash code to a hexadecimal string
        String shortUrl = Integer.toHexString(hashCode);
        
        // Store the mapping between short and long URL
        urlMap.put(shortUrl, longUrl);
        
        return shortUrl;
    }

    // Method to retrieve the original long URL from a short URL
    public String getLongUrl(String shortUrl) {
        return urlMap.get(shortUrl);
    }

    public static void main(String[] args) {
        SimpleUrlShortener shortener = new SimpleUrlShortener();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a long URL to shorten:");
        String longUrl = scanner.nextLine();

        // Shorten the URL
        String shortUrl = shortener.shortenUrl(longUrl);
        System.out.println("Shortened URL: " + shortUrl);

        // Retrieve the long URL using the short URL
        String retrievedUrl = shortener.getLongUrl(shortUrl);
        System.out.println("Retrieved long URL: " + retrievedUrl);

        scanner.close();
    }
}
