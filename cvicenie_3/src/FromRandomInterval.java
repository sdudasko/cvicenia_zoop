import java.security.SecureRandom;

public class FromRandomInterval {

    public int randomByInterval(int a, int b) {
        SecureRandom $random = new SecureRandom();

        return $random.nextInt(b - a + 1) + a;
    }
}
