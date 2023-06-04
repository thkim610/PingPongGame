package pongV2;

import java.awt.Color;
import java.awt.Graphics;

public class HumanPaddle implements Paddle{
	//x,y는 위치
	double y, yVel; //y의 속도, 위치
	boolean upAccel, downAccel; // 위, 아래로 가속
	int player, x; //
	
	public HumanPaddle(int player) {
		upAccel = false; downAccel = false;
		y = 210; yVel = 0;
		if(player ==1) {
			x=20; //player 1 은 왼쪽에 위치
		}else {
			x=660; //player 2는 오른쪽에 위치
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
