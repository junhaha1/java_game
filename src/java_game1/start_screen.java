package java_game1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class start_screen extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;

	private Image introBackground = new ImageIcon(Main.class.getResource("./images/start.png")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("./images/menuBar.png")));
	private JButton exitButton = new JButton("X");
	
	private int mouseX, mouseY;

	private JButton startButton = new JButton("START");
	private JButton comeButton = new JButton("불러오기");
	private JButton quitButton = new JButton("EXIT");

	public start_screen() {
		setUndecorated(true);
		setTitle("삼국지");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		exitButton.setBounds(300, 0, 50, 30);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		add(exitButton);
		
		startButton.setBounds(125, 100, 100, 50);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				new game_screen();
			}
		});
		add(startButton);
		
		comeButton.setBounds(125, 160, 100, 50);
		comeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//게임 불러오기
			}
		});
		add(comeButton);
		
		quitButton.setBounds(125, 220, 100, 50);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		add(quitButton);

		menuBar.setBounds(0, 0, 350, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(menuBar);
	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);

	}

	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}

}
