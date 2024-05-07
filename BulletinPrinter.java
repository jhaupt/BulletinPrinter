import java.awt.Font;
import javax.swing.*;        
 
class BulletinPrinter {
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("BulletinPrinter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("This is a good idea.");
        frame.getContentPane().add(label);

	// Set colors and font
	label.setForeground(new java.awt.Color(255, 255, 255));	
	label.setFont(new Font("Verdana", Font.BOLD, 20));
	frame.getContentPane().setBackground(new java.awt.Color(0, 0, 0));
	
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    //add text reader with variable that changes over time 


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
