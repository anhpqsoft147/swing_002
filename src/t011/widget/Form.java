package t011.widget;

import t011.listener.CommonWindowListener;
import t011.listener.CustomMouseListener;
import t011.listener.CustomWindowListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form {

    private JFrame frame1;
    private int count;

    public Form() {
        frame1 = new JFrame("Hello");
    }

    public Form(JFrame frame1) {
        this.frame1 = frame1;
    }

    public void initConfig() {
        // frame1.setLayout(null); // Không sử dụng trình quản lý layout
        frame1.setLocation(100, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.addWindowListener(new CommonWindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                System.out.println("b");
            }
        });
//        JButton button1 = new JButton("Phep cong");
//        // buttonCal.setText("Handle: " + count);
//
//        button1.setBounds(50,350, 100, 50);
//        frame1.add(button1);
//
//        JButton button2 = new JButton("Phep tru");
//        button2.setBounds(170,350, 100, 50);
//        frame1.add(button2);
//
        JLabel jLabel = new JLabel();
        jLabel.setText("Ket qua thuc hien: ");

//        jLabel.setBounds(0, 410, 320, 20);
//        // jLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        frame1.add(jLabel);
//
//        JTextField jTextField = new JTextField();
//        jTextField.setBounds(40, 210, 100, 30);
//
//
//        frame1.add(jTextField);
        JPanel jPanel = new JPanel();
//        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.LINE_AXIS));

//        jPanel.setLayout(new BorderLayout());

        jPanel.setBackground(Color.BLUE);

        JButton b1 = new JButton("B1");
        b1.addMouseListener(new CustomMouseListener());

        jPanel.add(jLabel, BorderLayout.CENTER);

        JButton b2 = new JButton("B2");
        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jLabel.setText("Ban da click");
                System.out.println("Ban da nhan button 2");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");
        JButton b6 = new JButton("B6");

//        jPanel.add(b1, BorderLayout.NORTH);
//        jPanel.add(b2, BorderLayout.SOUTH);
//        jPanel.add(b3, BorderLayout.WEST);
//        jPanel.add(b4, BorderLayout.EAST);
//        jPanel.add(b4, BorderLayout.EAST);
//        jPanel.add(b4, BorderLayout.EAST);
//        jPanel.add(b4, BorderLayout.EAST);
//        jPanel.add(b4, BorderLayout.EAST);
//        jPanel.add(b4, BorderLayout.EAST);
//        jPanel.add(b4, BorderLayout.EAST);
//        jPanel.add(b4, BorderLayout.EAST);
//        jPanel.add(b4, BorderLayout.EAST);
//        jPanel.add(b4, BorderLayout.EAST);
//        jPanel.add(b4, BorderLayout.EAST);

        frame1.add(jPanel);
        frame1.setSize(320,500);
    }

    public void run() {
        frame1.setVisible(true);
    }
}
