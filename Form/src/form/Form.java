/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Abel saferyan
 */
public class Form extends JFrame {

    JPanel pl = new JPanel();
    JLabel lbl1 = new JLabel("String I");
    JLabel lbl2 = new JLabel("String II");
    JLabel lbl3 = new JLabel("Hasil");

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();

    JButton b1 = new JButton("PROSES");
    JButton b2 = new JButton("HAPUS");

    public Form() {
        add(lbl1);
        add(lbl2);
        add(lbl3);

        add(t1);
        add(t2);
        add(t3);

        add(b1);
        add(b2);
        add(pl);

        setTitle("GUI Swing");
        setBounds(100, 100, 300, 300);
        lbl1.setBounds(15, 20, 80, 25);
        lbl2.setBounds(15, 55, 125, 25);
        lbl3.setBounds(15, 90, 125, 25);

        t1.setBounds(120, 20, 80, 25);
        t2.setBounds(120, 50, 110, 25);
        t3.setBounds(120, 80, 150, 25);

        b1.setBounds(15, 190, 100, 25);
        b2.setBounds(120, 190, 80, 25);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        b1.addActionListener((ActionEvent e) -> {
            kirimdata();
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hapusdata();
            }
        });
    }

    public void kirimdata() {
        String a = t1.getText();
        String b = t2.getText();
        t3.setText(a+""+b);
        }
    public void hapusdata() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }

    public static void main(String[] args) {
        Form demo = new Form();
        demo.setVisible(true);
    }
}
