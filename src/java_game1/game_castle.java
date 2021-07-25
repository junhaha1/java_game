package java_game1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class game_castle extends JFrame{
	
	private JLabel title;
	private JLabel res1 = new JLabel("±Ý");
	private JLabel res2 = new JLabel("½Ò");
	private JLabel res3 = new JLabel("Æ¯»ê¹°");
	
	private JTextField res11 = new JTextField();
	private JTextField res22 = new JTextField();
	private JTextField res33 = new JTextField();
	
	private JButton info2_btn1 = new JButton("¹«Àå");
	private JButton info2_btn2 = new JButton("´Ý±â");
	
	private int mouseX, mouseY;
	
	public game_castle(String name, human_list list, castle my) {
		setTitle(name);
		setUndecorated(true);
		setSize(Main.CASTLE_WIDTH, Main.CASTLE_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
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
		
		
		JPanel info1 = new JPanel();
		info1.setBounds(5, 5, 340, 390);
		info1.setBackground(Color.LIGHT_GRAY);
		info1.setLayout(null);
		
		title = new JLabel(name);
		res1.setBounds(0, 0, 120, 30);
		
		res1.setBounds(10, 30, 120, 80);
		res2.setBounds(10, 165, 120, 80);
		res3.setBounds(10, 290, 120, 80);
		
		res11.setBounds(95, 60, 150, 30);
		res22.setBounds(95, 195, 150, 30);
		res33.setBounds(95, 320, 150, 30);
		
		res11.setText(Integer.toString(my.gold));
		res22.setText(Integer.toString(my.rice));
		res33.setText(Integer.toString(my.spec));
		
		res11.setEnabled(false);
		res22.setEnabled(false);
		res33.setEnabled(false);
		
		info1.add(title);
		info1.add(res1);
		info1.add(res2);
		info1.add(res3);
		
		info1.add(res11);
		info1.add(res22);
		info1.add(res33);
		
		add(info1);
		
		JPanel info2 = new JPanel();
		info2.setBounds(350, 0, 150, 400);
		info2.setBackground(Color.GRAY);
		info2.setLayout(null);
		
		info2_btn1.setBounds(0, 5, 150, 50);
		info2_btn2.setBounds(0, 60, 150, 50);
		
		info2_btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		
		info2_btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				new game_human(name, list, my.code);
			}
		});
		
		info2.add(info2_btn1);
		info2.add(info2_btn2);
	
		add(info2);
		
	}

}
