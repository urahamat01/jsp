package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class Class27 {

    private Container c;
    private JPasswordField pf;
    private Font f;

    Class27() {

        initComponents();

    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f = new Font("Arial", Font.BOLD, 18);

        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setForeground(Color.red);
        pf.setBackground(Color.BLUE);
        pf.setFont(f);
        pf.setBounds(50, 20, 150, 50);
        c.add(pf);
    }

    public static void main(String[] args) {
        Class26 frame = new Class26();

        frame.setVisible(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("class password field");
    }


   

   

}
