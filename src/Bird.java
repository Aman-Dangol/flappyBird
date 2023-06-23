import javax.swing.*;
import java.awt.*;

public class Bird extends JPanel {
    int x=0;
    int y =0;
    Bird(){

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x,y,50,50);
    }
    void moveBird(){
        setLocation(getX(),getY()+3);
        repaint();

    }
    void jump(){
        setLocation(getX(),getY()-15);
        repaint();
    }
}
