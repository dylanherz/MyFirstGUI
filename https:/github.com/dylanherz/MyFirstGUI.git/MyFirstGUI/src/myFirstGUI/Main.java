package myFirstGUI;
import javax.swing.JFrame;
public class Main {
	
	public static void main (String [] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(600, 600);
		mainFrame.setTitle("My First GUI Rocks!!");
		
		MyComponent theComponent = new MyComponent();
		mainFrame.add(theComponent);
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
