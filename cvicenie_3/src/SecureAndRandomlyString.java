import java.security.SecureRandom;
import java.util.Random;
/**
 * V dokumentacii som sa docital, ze tato metoda funguje len na generovanie intov
 * tak som urobil na generovanie intov, bolo by mozne ich vytvarat a hadzat rovno do pola a konvertovat cez ascii,
 * nie je to asi ale efektivne, potom som sa docital na stackoverflow ku inym sposobom, ale bolo pisane, ze mame skusit SecureRandom
 */
public class SecureAndRandomlyString extends Random {
    public SecureAndRandomlyString() {

        SecureRandom $random = new SecureRandom();
        int $randomInt = $random.nextInt(1000000);

        System.out.println($randomInt);
    }
}
