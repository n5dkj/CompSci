package Ultima;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MyGame {
	
	ImageIcon iiList[];
	int iIcons[][] = {
		{ 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78 },
		{ 78,115,113,113,113,113,113,113,113,113,113,113,113,113,116, 78 },
		{ 78,112, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 94, 78, 78, 95, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 94, 78, 78, 95, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 94, 78, 78, 95, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 94, 78, 78, 95, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 94, 78, 78, 95, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 94, 78, 78, 95, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78,112, 78 },
		{ 78,112, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78,112, 78 },
		{ 78,114,113,113,113,113,113,113,113,113,113,113,113,113,117, 78 },
		{ 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78 }};

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGame window = new MyGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyGame() {
		initialize();
	}

	private void initialize() {
		iiList = new ImageIcon[512];
		for (int i=0; i<512; i++) {
			int j = i % 32;
			int k = (i - j)/32;
			String sFile = "/Ultima/ultima" + String.format("%02d", k) + 
				String.format("%02d",j) + ".png";
			iiList[i] = new ImageIcon(MyGame.class.getResource(sFile));
		}
		
		frame = new JFrame();
		frame.setBounds(0, 0, 1024, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel[][] lblGrid = new JLabel[16][16];
		for (int i=0; i<16; i++)
			for (int j=0; j<16; j++) {
				lblGrid[i][j] = new JLabel();
				lblGrid[i][j].setIcon(iiList[iIcons[i][j]]);
				lblGrid[i][j].setBounds(20+j*32, (int)(20+i*32*0.5), 52+j*32, 52+i*32);
				frame.getContentPane().add(lblGrid[i][j]);
			}
	}
}
