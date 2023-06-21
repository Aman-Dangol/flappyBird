import javax.swing.*;
import java.awt.*;

public class Bird extends JPanel {
    int x=50;
    int y =260;
    Bird(){
//        setSize(100,100);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x,y,50,50);
    }
    void moveBird(){
        y+=3;
        repaint();

    }
    void jump(){
        x+=3;
        y-=20;
        repaint();
    }
}
