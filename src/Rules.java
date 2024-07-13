import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String name){
        this.name = name;

        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        JLabel heading = new JLabel("Welcome  "+ name + "  to  Simple  Minds  Game ! ");
        heading.setBounds(50, 30, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 18));
        rules.setText(
            "<html>"+ 
                "1. You will have to answer Ten questions here , answer point to point then Submit." + "<br><br>" +
                "2. In this quiz you have four options to each question , select any one." + "<br><br>" +
                "3. Every question you have 15 seconds to answer so, Hurry up ! " + "<br><br>" +
                "4. If you do not know the answer , move to the next question." + "<br><br>" +
                "5. And by the way, in this quiz you have the option to choose Lifeline." + "<br><br>" +
                "6. Ya ! but . . . 50-50 Lifeline can be used at once. " + "<br><br>." +
                "7. At last , you can Submit your answerand get the Score." + "<br><br>" +
                "8. May you know more than this quiz still, Good Luck :)" + "<br><br>" +
            "<html>"
        );
        add(rules);

        start = new JButton("Start");
        start.setBounds(250, 500, 100, 30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(400, 500, 100, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(800, 650);
        setLocation(350, 50);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start){
            setVisible(false);
            new Quiz(name);

        } else {
            setVisible(false);
            new Login();
        }
    }
}


