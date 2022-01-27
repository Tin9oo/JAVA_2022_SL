// package gui;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyApp extends JFrame{
	static final int OVAL = 0;
	static final int 

	MyApp(){
		setTitle("My First GUI App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);

		//
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		btn = new JButton("First Button");

		cp.add(btn);
	}

	class MyPanel extends JPanel{
		MyPanel(){
			setBackground(Color.YELLOW);
		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);

			g.drawLine(0, 0, 200, 200);
			g.fillOval(200, 200, 300, 100);
		}
	}

	public static void main(String[] args){
		new MyApp().setVisible(true);
	}
}