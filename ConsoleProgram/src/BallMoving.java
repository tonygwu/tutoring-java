import acm.graphics.GOval;
import acm.program.GraphicsProgram;
public class BallMoving extends GraphicsProgram {
	
	private double xVelocity;
	private double yVelocity;
	private GOval ball;
	
	private double gravity = 0.2;
	private int pauseInterval = 12;
	
	public void run() {
		xVelocity = 0.8;
		yVelocity = 0.0;
		ball = new GOval(100, 100, 50, 50);
		add(ball);
		while (true) {
			ball.move(xVelocity, yVelocity);
			if (ball.getY() > 500) {
//				ball.setLocation(ball.getX(), 500);
				yVelocity = -yVelocity;
			}
			yVelocity += gravity;
			if (ball.getX() > 650) {
				xVelocity = -xVelocity;
			}
			if (ball.getX() < 50) {
				xVelocity = -xVelocity;
			}
			pause(pauseInterval);
		}
	}
}
