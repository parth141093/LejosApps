package pack;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;

public class Robot {
		private static DataExchange DE; 
		private static LineFollower LFObj; 
		private static ObstacleDetector ODObj;

		public static void main(String[] args){
			DE = new DataExchange();
			ODObj = new ObstacleDetector(DE); 
			LFObj = new LineFollower(DE); 
			ODObj.start();
			LFObj.start();

			while(!Button.ESCAPE.isDown()){
				//Empty
			}
			LCD.drawString("Finished",0, 7); 
			LCD.refresh();
			System.exit(0);
		}
	}
