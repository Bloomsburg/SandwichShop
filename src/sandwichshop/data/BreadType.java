package sandwichshop.data;

import java.util.Random;

/**
 *
 * @author sbloo
 */
public enum BreadType {
    NO,
    CIABATTA,
    DUTCH_CRUNCH,
    RYE,
    SOURDOUGH;
    
    private static final Random RANDOM = new Random();
    
    public static BreadType randomBread() {
        return BreadType.values()[RANDOM.nextInt(BreadType.values().length)];
    }
}
