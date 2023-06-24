import javax.swing.*;
import java.awt.*;

public class RectangleDown extends JPanel {
    int x=0,y=0;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(x,y,getWidth(),getHeight());
    }
    void move(){
        if (getX()<-getWidth()){
            setLocation(Platform.WIDTH ,getY());
        }else
            setLocation(getX()-10,getY());

    }
}
