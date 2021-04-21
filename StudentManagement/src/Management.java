import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Management extends JPanel {


    public Management() {
        super(new GridLayout(1, 1));

        JTabbedPane tabbedPane = new JTabbedPane();

        //Icon one
        ImageIcon icon = createImageIcon("resources/home.png");
        Image image = icon.getImage();
        Image newImg = image.getScaledInstance(30, 40,  java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);  // transform it back

        //Icon two
        ImageIcon icon1 = createImageIcon("resources/school.png");
        Image image1 = icon1.getImage();
        Image newImg1 = image1.getScaledInstance(30, 40,  java.awt.Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImg1);  // transform it back

        //Icon three
        ImageIcon icon2 = createImageIcon("resources/students.png");
        Image image2 = icon2.getImage();
        Image newImg2 = image2.getScaledInstance(30, 40,  java.awt.Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(newImg2);  // transform it back

        //Icon four
        ImageIcon icon3 = createImageIcon("resources/exit.png");
        Image image3 = icon3.getImage();
        Image newImg3 = image3.getScaledInstance(30, 40,  java.awt.Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(newImg3);  // transform it back



        JComponent panel1 = makeTextPanel("Panel #1");
        tabbedPane.addTab("Home", icon, panel1,
                "Does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent panel2 = makeTextPanel("Panel #2");
        tabbedPane.addTab("Schools", icon1, panel2,
                "Does twice as much nothing");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        JComponent panel3 = makeTextPanel("Panel #3");
        tabbedPane.addTab("Students", icon2, panel3,
                "Still does nothing");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        JComponent panel4 = makeTextPanel("Panel #4");
        tabbedPane.addTab("Exit", icon3, panel4,
                "Still does nothing");
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);


        //Add the tabbed pane to this panel.
        add(tabbedPane);

        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

    }

    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Management.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from
     * the event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TabbedPaneDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new Management(), BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }
}