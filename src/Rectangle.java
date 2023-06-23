import javax.swing.*;
import java.awt.*;

public class Rectangle extends JPanel {
    int x=0;
    int y=0;
    int width=getWidth();
    int height= getHeight();
    Rectangle(){

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(x,y,width,height);
    }
}
