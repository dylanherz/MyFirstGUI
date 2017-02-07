package myFirstGUI;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
		static long counter = 0;
		
		public void paintComponent(Graphics g) {
			
			Car c = new Car(0,0, Color.RED);
			Car c2 = new Car(0,40, Color.BLUE);
			Car c3 = new Car(0,80, Color.BLACK);
			Car c4 = new Car(0,120, Color.GREEN);
			
			c.draw(g);
			c2.draw(g);
			c3.draw(g);
			c4.draw(g);
			
				System.out.println("Painted"+ counter++ + "times");
			
			}
			
		
	}
	

