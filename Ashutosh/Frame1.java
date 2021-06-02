import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame1 {
    JFrame F; JLabel L;
    Panel P ; JTextField T ; JButton B;
    Frame1(String name){
        F = new JFrame(name);
        P = new Panel();
        L = new JLabel("Text");
        T = new JTextField();
        B = new JButton("click");
        P.add(L);
        P.add(T);
        P.add(B);
        F.add(P);
        F.setSize(600,800);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Frame F =new Frame("JAVA");
    }
}