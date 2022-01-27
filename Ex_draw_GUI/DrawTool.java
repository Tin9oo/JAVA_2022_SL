import javax.swing.*;
import java.awt.*;

public class DrawTool extends JFrame {
	DrawTool() {
		setTitle("Select and Draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		Container cp = getContentPane();
		cp.setLayout(null);

		cp.add(new ToolPanel());
		cp.add(new DrawPanel());

		cp.setPreferredSize(new Dimension(600, 500));
		pack();
		setResizable(false);
		setVisible(true);
	}
	class ToolPanel extends JPanel {
		ToolPanel() {
			setBackground(Color.RED);
			setBounds(0, 0, 100, 500);

			setLayout(new GridLayout(3, 1));
			
			add(new JButton("Circle"));
			add(new JLabel("Rectangle")); // ImageIcon()
			add(new TextField(10));
		}
	}
	class DrawPanel extends JPanel {
		DrawPanel() {
			setBackground(Color.YELLOW);
			setBounds(100, 0, 500, 500);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2d = (Graphics2D)g; // more good

			g2d.rotate(0.5);

			g2d.setColor(Color.RED);
			g2d.setFont(new Font("Times New Roman", Font.BOLD, 40));
			g2d.drawString("Hello JAVA", 50, 50);
		}
	}
	public static void main(String[] args) {
		new DrawTool();
	}
}