package pack;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class ObstacleDetector extends Thread {

	private DataExchange DEObj;

	private EV3UltrasonicSensor us1;
	private final int securityDistance = 25;

	public ObstacleDetector(DataExchange DE){ 
		DEObj = DE;
	us1 = new EV3UltrasonicSensor(SensorPort.S2);
	}

	public void run(){
		while(true){
		if(us1.getDistanceMode() > securityDistance){ DEObj.setCMD(1);
		}else{
		DEObj.setCMD(0);

		//LCD Output
		LCD.drawString("Object found!", 0,1); LCD.refresh();
		Sound.twoBeeps(); Sound.twoBeeps();
			}
		}
	}

	
}
