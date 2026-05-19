import java.awt.*;
import java.applet.*;

public class Flag extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(50, 20, 5, 400);

        g.setColor(new Color(255, 153, 51)); // Saffron
        g.fillRect(55, 20, 300, 50);

        g.setColor(Color.white);
        g.fillRect(55, 70, 300, 50);

        g.setColor(new Color(18, 136, 18)); // Green
        g.fillRect(55, 120, 300, 50);

        g.setColor(Color.blue);
        g.drawOval(180, 70, 50, 50);
        
        for (int i = 0; i < 24; i++) {
            g.drawLine(205, 95, 
                (int)(205 + 25 * Math.cos(Math.toRadians(i * 15))),
                (int)(95 + 25 * Math.sin(Math.toRadians(i * 15))));
        }
    }
}
