package pongV2;

import java.awt.Color;
import java.awt.Graphics;

public class HumanPaddle implements Paddle{
	//x,y�� ��ġ
	double y, yVel; //y�� �ӵ�, ��ġ
	boolean upAccel, downAccel; // ��, �Ʒ��� ����
	int player, x; //
	
	public HumanPaddle(int player) {
		upAccel = false; downAccel = false;
		y = 210; yVel = 0;
		if(player ==1) {
			x=20; //player 1 �� ���ʿ� ��ġ
		}else {
			x=660; //player 2�� �����ʿ� ��ġ
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, (int)y, 20, 80);
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	public void setUpAccel(boolean input) {
		upAccel = input;
	}
	
	public void setDownAccel(boolean input) {
		downAccel = input;
	}

	public int getY() {
		return (int)y;
	}

}
