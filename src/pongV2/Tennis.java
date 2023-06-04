package pongV2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tennis extends Applet implements Runnable, KeyListener {
	final int WIDTH = 700, HEIGHT = 500;
	Thread thread;
	HumanPaddle p1;
	
	public void init() {
		this.resize(WIDTH, HEIGHT); // 게임화면 크기 초기화
		
		this.addKeyListener(this);
		p1 = new HumanPaddle(1);
		thread = new Thread(this);
		thread.start();
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT); //배경색: 검정으로 설정
		p1.draw(g);
	}
	
	public void update(Graphics g) {
		paint(g);
	}
	@Override
	public void run() {
		for(;;) {
			
			p1.move();
			
			repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p1.setUpAccel(true); //키를 누르고 있는동안 속도 증가
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDownAccel(true);
		}
	}
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p1.setUpAccel(false); // 키를 떼면 속도 줄어듬
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDownAccel(false);
		}
		
	}
}
