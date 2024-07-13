import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

  JButton rules,quit;
  JTextField tfname;

    Login(){
       getContentPane().setBackground(Color.CYAN);
       setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Simple Minds Quiz");
        heading.setBounds(700, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 32));
        heading.setForeground(Color.BLUE);
        add(heading);


        JLabel name = new JLabel("Enter your name ");
        name.setBounds(800, 150, 300, 20);
        name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        name.setForeground(Color.BLUE);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        quit = new JButton("Quit");
        quit.setBounds(915, 270, 120, 25);
        quit.setBackground(Color.BLUE);
        quit.setForeground(Color.WHITE);
        quit.addActionListener(this);
        add(quit);


        setSize(1200, 500);
        setLocation(100, 100);
        setVisible(true);

      }

      public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
          String name = tfname.getText();
          setVisible(false);
          new Rules(name);

        } else if(ae.getSource() == quit){
          setVisible(false);
        }
      }


      public static void main(String[] args) throws Exception {
        new Login();
        //new Rules();
    }
}

