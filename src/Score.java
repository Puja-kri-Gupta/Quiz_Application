import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener{
    
     Score(String name, int Score){
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(40, 150, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank You "+ name +"," + " for this game."  );
        heading.setBounds(45, 50, 1000, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel score1 = new JLabel("Your Score is " + Score + ".");
        score1.setBounds(400, 200, 1000, 30);
        score1.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        score1.setForeground(Color.black);   
        add(score1);

        JButton submit = new JButton("Play Again");
        submit.setBounds(455, 270, 150, 32);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);

       }

    public static void main(String args[]){
         new Score("User", 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }
}
