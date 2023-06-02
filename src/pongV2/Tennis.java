package pongV2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Tennis extends Applet {
	final int WIDTH = 700, HEIGHT = 500;
	public void init() {
		this.resize(WIDTH, HEIGHT); // 게임화면 크기 초기화
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT); //배경색: 검정으로 설정
	}
	
	public void update(Graphics g) {
		paint(g);
	}
}
