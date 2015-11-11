package Oldwindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Original {

	private JFrame frame;
	private int iIconSize = 100;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Original window = new Original();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Original() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon[] iiList = new ImageIcon[15];
		iiList[0] = new ImageIcon("C:\\path\\image01.png");
		
		JLabel[][] lTiles = new JLabel[8][8];
		for (int i=0; i<8; i++)
			for (int j=0; j<8; j++) {
				lTiles[i][j] = new JLabel("");
				lTiles[i][j].setIcon(iiList[(int) Math.floor(Math.random()*15)]);
				lTiles[i][j].setBounds((int) (i * iIconSize * 1.05 +100), (int) (j*iIconSize*0.7f+100),
					(int) ((i+1) * iIconSize* 1.05 +100), (int) ((j+1)*iIconSize*0.7f+100));
				frame.getContentPane().add(lTiles[i][j]);
			}
		
	}

}
