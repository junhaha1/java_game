package java_game1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class game_screen extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;

	private Image Background = new ImageIcon(Main.class.getResource("./images/ground.png")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("./images/game_menuBar.png")));
	private JButton exitButton = new JButton("X");

	private int mouseX, mouseY;

	private JButton backButton = new JButton("back");

	private JButton seoulCastle = new JButton(); // 임시 서울 버튼
	private JButton busanCastle = new JButton(); // 임시 서울 버튼
	
	
	public human_list list_h = new human_list(); //임시 무장
	public castle_list list_c = new castle_list(); //임시 도시

	public game_screen() {
		setUndecorated(true);
		setTitle("한반도 삼국지");
		setSize(Main.GAME_WIDTH, Main.GAME_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);

		exitButton.setBounds(650, 0, 50, 30);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		add(exitButton);

		backButton.setBounds(580, 0, 60, 30);
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				new start_screen();
			}
		});
		add(backButton);

		menuBar.setBounds(0, 0, 700, 30);
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

		seoulCastle.setBounds(280, 340, 20, 20);
		seoulCastle.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				new game_castle("seoul", list_h, list_c.get(0));
			}
		});
		add(seoulCastle);
		
		busanCastle.setBounds(410, 450, 20, 20);
		busanCastle.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				new game_castle("busan", list_h, list_c.get(1));
			}
		});
		add(busanCastle);
	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.GAME_WIDTH, Main.GAME_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(Background, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
}
