package sandwichshop;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sandwichshop.display.MainDisplay;

/**
 *
 * @author sbloo
 */
public class SandwichShop {

    /** The current version of Sandwich Shop. */
    public static String VERSION = "v0.1";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException ex) {
            //LOGGER.log(Level.FINER, "Error setting look and feel.", ex);
        } catch (IllegalAccessException ex) {
            //LOGGER.log(Level.FINER, "Illegal access when setting look and feel.", ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //exLOGGER.log(Level.FINER, "Unsupported Look and Feel provided by UIManager.", ex);
        }
        MainDisplay mainDisp = new MainDisplay();
        mainDisp.launch();
    }
    
}
