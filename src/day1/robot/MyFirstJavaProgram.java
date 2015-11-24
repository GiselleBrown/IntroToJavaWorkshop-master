package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot TinMan= new Robot ();
for (int i = 0; i < 4; i++) {
	TinMan.setSpeed(10);
	TinMan.penDown();
	TinMan.move(200);
	TinMan.turn(90);
		
}
TinMan.move(100);
TinMan.turn(90);
		
		
	}
}

