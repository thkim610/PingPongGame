package pongV2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Tennis extends Applet {
	final int WIDTH = 700, HEIGHT = 500;
	public void init() {
		this.resize(WIDTH, HEIGHT); // ����ȭ�� ũ�� �ʱ�ȭ
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT); //����: �������� ����
	}
	
	public void update(Graphics g) {
		paint(g);
	}
}
