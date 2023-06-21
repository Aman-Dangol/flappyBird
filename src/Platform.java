import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Platform extends JFrame implements ActionListener , KeyListener {
    public static int width=500;
    public static int height=600;
    Bird bird = new Bird();
    Timer timer;
    Platform(){
        setSize(width,height);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.blue);
        timer= new Timer(20,this);
        add(bird);
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
