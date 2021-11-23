package com.john.swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.Executor;

import javax.imageio.ImageIO;
import javax.swing.Timer;
import javax.swing.JPanel;

public class MyPanel5 extends JPanel {
	private static final int DELAY = 1000/30;
	private BufferedImage img;
	private int xDelta;
	private int yDelta;
	private int xPos;
	private int yPos;

	// worse coding example
	MyPanel5(){
		URL imgUrl = this.getClass().getResource("resources/diamondK.gif");
		try {
			img = ImageIO.read(new File(imgUrl.getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Random rand = new Random();
		xDelta = rand.nextInt(5) + 1; // 1~5 positive
		yDelta = rand.nextInt(5) + 1;
		if(rand.nextBoolean()) {
			xDelta *= -1;
		}
		if(rand.nextBoolean()) {
			yDelta *= -1;
		}
		
		// put image on the center of this panel
		xPos = (getPreferredSize().width - img.getWidth())/2;
		yPos = (getPreferredSize().height - img.getWidth())/2;

		Timer timer = new Timer(DELAY, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xPos += xDelta;
				yPos += yDelta;
				
				// bounce
				if (xPos + img.getWidth() > getWidth()) {
					xPos = getWidth() - img.getWidth();
					xDelta *= -1;
				}else if(xPos<0) {
					xPos = 0;
					xDelta *= -1;
				}
				if (yPos + img.getHeight() > getHeight()) {
					yPos = getHeight() - img.getHeight();
					yDelta *= -1;
				}else if(yPos<0) {
					yPos = 0;
					yDelta *= -1;
				}
				repaint();
			}
			
		});
		timer.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (img != null) {
			Graphics2D g2 = (Graphics2D)g.create();
			g2.drawImage(img, xPos, yPos, this); // quickly drawing the image
			g2.dispose();
		}
	}
	
	
}
