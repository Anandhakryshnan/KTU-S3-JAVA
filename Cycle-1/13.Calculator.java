import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
public class calculator extends JFrame implements ActionListener {
    JTextField jtf = new JTextField();
    calculator() {
    this.getContentPane().setBackground(Color.CYAN);
     
        this.setSize(500, 500);
        JLabel jbl = new JLabel("CALCULATOR");
        this.setFont(new Font("Monospaced", Font.PLAIN, 18));
        jbl.setBounds(210, 10, 400, 30);
        this.add(jbl);
        jtf.setEditable(true);
        jtf.setBounds(50, 50, 400, 30);
        this.add(jtf);
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub,
                badd, bdec, beq, clear, dot, bdel;
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        
        bdiv = new JButton("/");
        bmul = new JButton("*");
        bsub = new JButton("-");
        badd = new JButton("+");
        bdec = new JButton(".");
        beq = new JButton("=");
        clear = new JButton("Clear");
        clear.setBackground(Color.RED);
        dot = new JButton(".");
        bdel = new JButton("Back");
        
        b7.setBounds(90, 100, 50, 40);
        b8.setBounds(180, 100, 50, 40);
        b9.setBounds(270, 100, 50, 40);
        bdiv.setBounds(360, 310, 50, 40);
        
        b4.setBounds(90, 170, 50, 40);
        b5.setBounds(180, 170, 50, 40);
        b6.setBounds(270, 170, 50, 40);
        bmul.setBounds(360, 170, 50, 40);
        
        b1.setBounds(90, 240, 50, 40);
        b2.setBounds(180, 240, 50, 40);
        b3.setBounds(270, 240, 50, 40);
        bsub.setBounds(360, 240, 50, 40);
        
        b0.setBounds(180, 310, 50, 40);
        beq.setBounds(310, 380, 100, 50);
        badd.setBounds(270, 310, 50, 40);
        clear.setBounds(180, 380, 100, 50);
        dot.setBounds(90, 310, 50, 40);
        bdel.setBounds(340, 100, 70, 40);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(bdiv);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(bmul);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(bsub);
        this.add(b0);
        this.add(beq);
        this.add(badd);
        this.add(clear);
        this.add(dot);
        this.add(bdel);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "1");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "2");
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "3");
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "4");
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "5");
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "6");
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "7");
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "8");
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "9");
            }
        });
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "0");
            }
        });
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText("");
            }
        });
        dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + ".");
            }
        });
        badd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "+");
            }
        });
        bsub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "-");
            }
        });
        bmul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "*");
            }
        });
        bdiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(jtf.getText() + "/");
            }
        });
        bdel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inp = jtf.getText();
                inp = inp.substring(0, inp.length() - 1);
                jtf.setText(inp);
            }
        });
        beq.addActionListener(this);
    }

    public static void main(String[] args) {
        new calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String S = jtf.getText();
            int i = 0;
            char b = S.charAt(i);
            while (b != '+' && b != '-' && b != '*' && b != '/') {
                i++;
                b = S.charAt(i);
            }
            Float x, y, ans = 0f;
            x = Float.parseFloat(S.substring(0, i));
            y = Float.parseFloat(S.substring(i + 1, S.length()));
            if (b == '+') {
                ans = x + y;
            } else if (b == '-') {
                ans = x - y;
            } else if (b == '*') {
                ans = x * y;
            } else if (b == '/') {
                ans = x / y;
            }
            if (b == '/' && y == 0) {
                jtf.setText("Not defined!");
            } else {
                jtf.setText(ans + "");
            }
        } catch (Exception ex) {
            jtf.setText("Invalid operation!");
        }
    }
}
