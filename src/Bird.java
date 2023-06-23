import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bird extends JPanel {
    int x=0;
    int y =0;
    int fallingSpeed=5;
    int jumpSpeed=-20;
    int gravity =1;

    Bird(){
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(null);
        g.setColor(Color.red);
        g.fillOval(x,y,50,50);
    }
    void moveBird(){
        setLocation(getX(),getY()+fallingSpeed);
        fallingSpeed++;
        repaint();
    }
    public void jump(){
        fallingSpeed=jumpSpeed;

    }


}
