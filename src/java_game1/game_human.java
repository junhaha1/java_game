package java_game1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class game_human extends JFrame{
	private JButton info2_btn2 = new JButton("´Ý±â");
	private int mouseX, mouseY;
	ArrayList<JTextField> list = new ArrayList<JTextField>();
	BoxLayout layout;
	
	public game_human(String name, human[] humanlist) {
		setTitle(name);
		setUndecorated(true);
		setSize(Main.HUMAN_WIDTH, Main.HUMAN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		
		info2_btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		
		JPanel human_info = new JPanel();
		human_info.setLayout(new BoxLayout(human_info, BoxLayout.Y_AXIS));
		
		for (int i = 0; i < 5; i++) {
			if (humanlist[i].location == 1)
				list.add(new JTextField(humanlist[i].name + "\t" + humanlist[i].age));
		}
		
		
		for (JTextField i : list)
			human_info.add(i);
		add(human_info, BorderLayout.CENTER);
		add(info2_btn2, BorderLayout.SOUTH);
		
	}
}
