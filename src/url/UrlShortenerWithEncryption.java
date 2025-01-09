package url;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class UrlShortenerWithEncryption {

    // AES encryption key (256-bit key size for strong encryption)
    private static final String SECRET_KEY = "12345678901234567890123456789012"; // 32 characters for 256-bit key

    // Method to encrypt the URL
    public String encryptUrl(String longUrl) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encryptedBytes = cipher.doFinal(longUrl.getBytes());
        return Base64.getUrlEncoder().encodeToString(encryptedBytes);
    }

    // Method to decrypt the URL
    public String decryptUrl(String shortUrl) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decryptedBytes = cipher.doFinal(Base64.getUrlDecoder().decode(shortUrl));
        return new String(decryptedBytes);
    }

    public static void main(String[] args) {
        try {
            UrlShortenerWithEncryption shortener = new UrlShortenerWithEncryption();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a long URL to shorten:");
            String longUrl = scanner.nextLine();

            // Encrypt and shorten the URL
            String shortUrl = shortener.encryptUrl(longUrl);
            System.out.println("Encrypted and Shortened URL: " + shortUrl);

            // Decrypt and retrieve the original URL
            String retrievedUrl = shortener.decryptUrl(shortUrl);
            System.out.println("Decrypted and Retrieved long URL: " + retrievedUrl);

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

