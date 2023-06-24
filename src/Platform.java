import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Platform extends JFrame implements ActionListener , KeyListener{
    public static int width=500;
    public static int height=600;
    Bird bird = new Bird();
    RectangleUp rectangleUp = new RectangleUp();
    RectangleDown rectangleDown = new RectangleDown();
     Timer timer;

    Platform(){
        setTitle("flappy bird");
        setLayout(null);
        setSize(width,height);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.green);
        timer= new Timer(50,this);
        add(bird);
        bird.setSize(50,50);
        bird.setLocation(80,100);

        add(rectangleUp);
        rectangleUp.setSize(80,230);
        rectangleUp.setLocation(200,0);

        add(rectangleDown);

        rectangleDown.setSize(80,130);
        rectangleDown.setLocation(200,600-130);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timer.start();
        addKeyListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            bird.moveBird();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        bird.jump();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
