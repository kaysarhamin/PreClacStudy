import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JFrame frame;
    private JButton button;
    private JButton button3;
    private JButton button4;
    private String title;
    private int width;
    private int height;
    private JLabel label;
    private JTextField input;
    private JButton button2;
    private String label1;
    private String ansCho1;
    private String ansCho2;
    private String ansCho3;
    private String ansCho4;
    private int ans;



    public GUI(int w, int h, String l, String a1, String a2, String a3, String a4 ) {
        frame = new JFrame();
        label = new JLabel( l);
        input = new JTextField(10);
        button2 = new JButton(a2);
        button = new JButton( a1);
        button3= new JButton(a3);
        button4= new JButton(a4);
        width = w;
        height = h;
        label1 = l;
        ansCho1= a1;
        ansCho2=a2;
        ansCho3=a3;
        ansCho4=a4;


    }
    public void setUpGUI() {
        Container cp = frame.getContentPane();
        FlowLayout flow= new FlowLayout();
        cp.setLayout(flow);
        frame.setSize(width, height);
        frame.setTitle(" GUI Demo" );
        cp.add(label);
        cp.add(button);
        cp.add(button2);
        cp.add(button3);
        cp.add(button4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public  int getAns()
    {
        return ans;
    }
    public static void main(String[] args) {
    }

public void setUpButtonListeners() {
        ActionListener buttonListener =  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             if(e.getSource()== button)
             {
                 ans=1;
             }
                if(e.getSource()== button2)
                {
                    ans=2;
                }
                if(e.getSource()== button3)
                {
                    ans=3;
                }
                if(e.getSource()== button4)
                {
                    ans=4;
                }

            }

        };
        button.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
    button3.addActionListener(buttonListener);
    button4.addActionListener(buttonListener);
}
}
