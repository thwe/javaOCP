package adapterClasses.eventHandlingGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AWTEventHandlingInnereKlassen extends Frame {

    public static void main(String[] args) {
        AWTEventHandlingInnereKlassen awt_EventHandling
                = new AWTEventHandlingInnereKlassen();
    }

    public AWTEventHandlingInnereKlassen() {
        super("Nachrichtentransfer");
        setBackground(Color.LIGHT_GRAY);
        setSize(300, 200);
        setLocation(200, 100);
        setVisible(true);
        addKeyListener(new MyKeyListener());
    }

    class MyKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {
            if (event.getKeyCode() == KeyEvent.VK_ESCAPE) {
                setVisible(false);
                dispose();
                System.exit(0);
            }
        }
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Serif", Font.PLAIN, 18));
        g.drawString("Zum Beenden bitte ESC drücken...", 10, 50);
    }
}
