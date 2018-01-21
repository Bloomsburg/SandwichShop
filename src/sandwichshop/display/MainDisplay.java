package sandwichshop.display;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import sandwichshop.SandwichShop;
import sandwichshop.data.BreadType;
import sandwichshop.data.CheeseType;
import sandwichshop.data.MeatType;
import sandwichshop.data.Sandwich;

/**
 *
 * @author sbloo
 */
public class MainDisplay {
    
    private JFrame m_frame;
    private JPanel m_ingredientsPanel;
    private JButton m_button;
    private JComboBox<BreadType> m_breadBox;
    private JComboBox<CheeseType> m_cheeseBox;
    private JComboBox<MeatType> m_meatBox;
    private JTextArea m_textArea;
    
    private static final Dimension DIM = new Dimension(800, 600);
    
    public MainDisplay() {
        initialize();
    }
    
    public void launch() {
        m_frame.pack();
        m_frame.setVisible(true);
    }
    
    private void initialize() {
        // Initialize top level window.
        m_frame = new JFrame("Sandwich Shop - " + SandwichShop.VERSION);
        m_frame.setPreferredSize(DIM);
        m_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m_frame.setLayout(new BorderLayout());
        
        // Add components to panel.
        m_ingredientsPanel = new JPanel();
        m_breadBox = new JComboBox<>(BreadType.values());
        m_cheeseBox = new JComboBox<>(CheeseType.values());
        m_meatBox = new JComboBox<>(MeatType.values());
        
        m_ingredientsPanel.add(m_breadBox);
        m_ingredientsPanel.add(m_cheeseBox);
        m_ingredientsPanel.add(m_meatBox);        

        // Initialize text area.
        m_textArea = new JTextArea();
        m_textArea.setEditable(false);
        
        // Initialize button.
        m_button = new JButton("Make Sando!");
        m_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                BreadType bread = m_breadBox.getItemAt(m_breadBox.getSelectedIndex());
                CheeseType cheese = (CheeseType)m_cheeseBox.getSelectedItem();
                MeatType meat = m_meatBox.getItemAt(m_meatBox.getSelectedIndex());
                Sandwich sando = new Sandwich(bread, cheese, meat);
                m_textArea.setText(sando.toString());
            }
        });
        
        // Add components to top level window.
        m_frame.add(m_ingredientsPanel, BorderLayout.PAGE_START);
        m_frame.add(m_textArea, BorderLayout.CENTER);
        m_frame.add(m_button, BorderLayout.PAGE_END);
        
    }
    
}
