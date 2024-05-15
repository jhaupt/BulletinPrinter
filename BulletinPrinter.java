import java.awt.Font;
import javax.swing.*;        
import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BulletinPrinter {

	public static String readMessage() {
		String line_of_text = "null";	//Initialize line_of_text
		try {
			Scanner myReader = new Scanner(new File("./messages.txt"));
			while (myReader.hasNextLine()) {
				line_of_text = myReader.nextLine();
			}
			myReader.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return line_of_text;
	}

	private static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame = new JFrame("BulletinPrinter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//Add the ubiquitous "Hello World" label.
		JLabel label = new JLabel(readMessage());
		frame.getContentPane().add(label);

		// Set colors and font
		label.setForeground(new java.awt.Color(255, 255, 255));	
		label.setFont(new Font("Verdana", Font.BOLD, 80));
		frame.getContentPane().setBackground(new java.awt.Color(0, 0, 0));


		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		createAndShowGUI();
	}
}
