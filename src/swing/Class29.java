package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Class29 extends JFrame {

    private Container c;
    private JButton btn1, btn2;
    private Font f;
    private Cursor cursor;

    Class29() {

        initComponents();
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);

        f = new Font("Arial", Font.BOLD, 18);
       // cursor = new Cursor(Cursor.HAND_CURSOR);
        cursor = new Cursor(Cursor.MOVE_CURSOR);

        btn1 = new JButton("Submit");
        btn1.setFont(f);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.PINK);
        btn1.setBackground(Color.GREEN);
        btn1.setBounds(100, 50, 100, 50);
        c.add(btn1);

        btn2 = new JButton("Clear");

        btn2.setFont(f);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.yellow);
        btn2.setBackground(Color.blue);
        btn2.setBounds(220, 50, 100, 50);
        c.add(btn2);

    }

    public static void main(String[] args) {
        Class29 frame = new Class29();

        frame.setVisible(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("ButtonDemo");
    }

}
