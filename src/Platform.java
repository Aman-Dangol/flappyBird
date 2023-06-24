import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Platform extends JFrame implements ActionListener , KeyListener{
    public static int WIDTH=500;
    public static int HEIGHT=600;
    Bird bird = new Bird();
    RectangleUp rectangleUp = new RectangleUp();
    RectangleDown rectangleDown = new RectangleDown();
     Timer timer;

    Platform(){
        setResizable(false);
        setTitle("flappy bird");
        setLayout(null);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.green);
        timer= new Timer(30,this);
        add(bird);
        bird.setSize(30,30);
        bird.setLocation(80,100);
    //setting up top obstacle
        add(rectangleUp);
        rectangleUp.setSize(80,230);
        rectangleUp.setLocation(300,0);
        //setting up bottom obstacle
        add(rectangleDown);
        rectangleDown.setSize(80,130);
        rectangleDown.setLocation(300,600-130);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //game starts
        timer.start();
        setVisible(true);
        addKeyListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            bird.moveBird();
        rectangleUp.move();
        rectangleDown.move();
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
