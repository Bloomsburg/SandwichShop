package sandwichshop.data;

import java.util.ArrayList;
import java.util.Random;

/**
 * Sandwich is a data object that represents a sandwich.
 * @author sbloo
 */
public class Sandwich {

    /** The bread of the Sandwich. */
    private final BreadType m_bread;
    /** The  of the Sandwich. */
    private final CheeseType m_cheese;
    /** The meat of the Sandwich. */
    private final MeatType m_meat;
    
    /** A list of sentence openings. */
    private static final ArrayList<String> OPENINGS = new ArrayList<>();
    static {
        OPENINGS.add("I want a ");
        OPENINGS.add("Sling me a ");
        OPENINGS.add("Gimme a ");
        OPENINGS.add("Can a brother get a ");
        OPENINGS.add("Hook me up with a ");
    }
    
    private static final Random RANDOM = new Random();
    
    
    /**
     * Constructor, creates and instance of a Sandwich.
     * 
     * @param bread the bread of the sandwich. Must not be null.
     * @param cheese the cheese of the sandwich. Must not be null.
     * @param meat the meat of the sandwich. Must not be null.
     * 
     * @throws IllegalArgumentException if any parameter is null.
     */
    public Sandwich(BreadType bread, CheeseType cheese, MeatType meat) {
        if (bread == null) {
            throw new IllegalArgumentException("Parameter 'bread' cannot be null.");
        }
        if (cheese == null) {
            throw new IllegalArgumentException("Parameter 'cheese' cannot be null.");
        }
        if (meat == null) {
            throw new IllegalArgumentException("Parameter 'meat' cannot be null.");
        }
        
        m_bread = bread;
        m_cheese = cheese;
        m_meat = meat;
    }
    
    /**
     * Returns the bread type of the sandwich.
     * @return the bread type of the sandwich. 
     */
    public BreadType getBread() {
        return m_bread;
    }

    /**
     * Returns the cheese type of the sandwich.
     * @return the cheese type of the sandwich. 
     */    
    public CheeseType getCheese(){
        return m_cheese;
    }
    
     /**
     * Returns the meat type of the sandwich.
     * @return the meat type of the sandwich. 
     */
    public MeatType getMeat() {
        return m_meat;
    }
    
    public String toString() {
        return OPENINGS.get(RANDOM.nextInt(OPENINGS.size())) + m_meat.name() + " and " + m_cheese.name() + " on " + m_bread.name();
    }
}
