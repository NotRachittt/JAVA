import java.applet.*;
import java.awt.*;

public class Man extends Applet {
	
	public void paint (Graphics g) {
		
		setBackground(Color.LIGHT_GRAY);

		g.setColor(Color.YELLOW);
		g.fillRect(125, 450, 250, 250);
		//g.drawLine(500, 500, 250, 250);
		
		g.setColor(Color.YELLOW);
		g.fillOval(100, 100, 300, 300);

		g.setColor(Color.BLACK);
		g.drawOval(100, 100, 300, 300);

		g.fillOval(170, 180, 40, 40);
		g.fillOval(290, 180, 40, 40);

		g.drawArc(170, 220, 160, 100, 0, -180);
	}
}
