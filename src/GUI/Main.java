package GUI;

import GUI.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;      //Action Listener is an interface which is for receiving action events
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;     // MouseMotionListener is an interface { A mouse motion event is generated when the mouse is moved or dragged }

public class Main extends JFrame{      //JFrame is a container and works like a container where components like button,label are added to create a GUI
    Main(){
        JFrame first=new JFrame();
        JLabel tit=new JLabel("OOM C3 MINI PROJECT");
        JLabel members[]={new JLabel("Ankit Sharma (IIT2021036)"),new JLabel("Surendra Tholiya (IIT2021097) "),new JLabel("Rishi Joshi (IIT2021098)")};
        first.setContentPane(new JLabel(new ImageIcon("abc1.jpg")));
        JLabel tit1=new JLabel("Interactive Polygon Area Calculator");
        JButton next=new JButton("Next");

        //changing parameters of members[]
        for(int i=0;i<3;i++){
            members[i].setBounds(200,230+i*40,450,200);
            members[i].setIconTextGap(20);        // How many pixels should appear between the text and the image (By default 4 pixel)
            members[i].setFont(new Font("Poppins",Font.BOLD,25));
            members[i].setForeground(Color.white);
            members[i].setVisible(true);
            first.add(members[i]);
        }

        //Adding Actionlistner to button
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame();
                first.dispose();   //The Dispose method performs all object cleanup, so the garbage collector no longer needs to call the objects' Object
            }
        });

        //next button border
        next.setBackground(Color.WHITE);
        next.setBorder(BorderFactory.createEtchedBorder());

        //Change to the Hand Cursor when we hover on the next button
        next.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }
            @Override
            public void mouseMoved(MouseEvent e) {
                final int x = e.getX();
                final int y = e.getY();
                // only display a hand if the cursor is over the items
                if (next != null && next.contains(x, y)) {
                    next.setCursor(new Cursor(Cursor.HAND_CURSOR));
                } else {
                    next.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
            }
        });


        //setting font style
        tit.setFont(new Font("Poppins",Font.BOLD,30));
        tit1.setFont(new Font("Poppins",Font.BOLD,30));
        next.setFont(new Font("Poppins",Font.BOLD,20));

        //setting colors
        tit1.setForeground(Color.WHITE);
        tit.setForeground(Color.WHITE);
        next.setForeground(Color.WHITE);

        //setting bounds
        tit1.setBounds(100,150,600,100);
        tit.setBounds(180,100,400,100);
        first.setBounds(0,0,750,700);
        next.setBounds(300,500,100,50);

        //Adding components to frame
        first.add(next);
        first.add(tit1);
        first.add(tit);

        //Setting Attributes of frame
        first.setLayout(null);
        first.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        first.setResizable(false);
        first.setVisible(true);

    }
    public static void main(String[] args) {
        new Main();
    }
}
