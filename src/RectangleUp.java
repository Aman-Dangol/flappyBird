import javax.swing.*;
import java.awt.*;

public class RectangleUp extends JPanel {
    int x=0;
    int y=0;
    int width=getWidth();
    int height= getHeight();
    RectangleUp(){

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(x,y,width,height);
    }
}
