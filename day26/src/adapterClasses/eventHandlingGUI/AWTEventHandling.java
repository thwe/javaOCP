
package adapterClasses.eventHandlingGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;


public class AWTEventHandling extends Frame {

    public static void main(String[] args) {
        AWTEventHandling awt_EventHandling = new AWTEventHandling();
    }

    public AWTEventHandling() {
        super("Nachrichtentransfer");
        setBackground(Color.LIGHT_GRAY);
        setSize(300, 200);
        setLocation(200, 100);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Serif", Font.PLAIN, 18));
        g.drawString("Zum Beenden bitte ESC druecken...", 10, 50);
    }
}
