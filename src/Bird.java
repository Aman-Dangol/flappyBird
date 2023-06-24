import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bird extends  JLabel {
    int x=0;
    int y =0;
    int fallingSpeed=5;
    int jumpSpeed=-10;
    int gravity =1;

    Bird(){
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        g.fillOval(x,y,getWidth(),getHeight());
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
