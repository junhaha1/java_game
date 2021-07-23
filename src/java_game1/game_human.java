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
	ArrayList<JTextField> info_list = new ArrayList<JTextField>();
	
	public game_human(String name, human_list list) {
		setTitle(name);
		setUndecorated(true);
		setSize(Main.HUMAN_WIDTH, Main.HUMAN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		info2_btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		
		JPanel human_info = new JPanel();
		JPanel menu_bar = new JPanel();
		human_info.setLayout(new BoxLayout(human_info, BoxLayout.Y_AXIS));
		
		for (human i : list.Human) {
			if (i.location == 1)
				info_list.add(new JTextField(i.name + " " + i.STR + " " + i.INT + " " + i.ATT + " " + i.age));
		}
		
		
		for (JTextField i : info_list) {
			i.setEnabled(false);
			human_info.add(i);
		}
		
		menu_bar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menu_bar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		
		add(menu_bar, BorderLayout.NORTH);
		add(human_info, BorderLayout.CENTER);
		add(info2_btn2, BorderLayout.SOUTH);
		
	}
}
