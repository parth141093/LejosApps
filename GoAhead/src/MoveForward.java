import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;

public class MoveForward extends Thread {
	private DataExchange DEObj;
	

	private static EV3ColorSensor colorSensor;
	private static SampleProvider spColor;
	private static float[] sample;
	
	private static EV3LargeRegulatedMotor leftWheel;
	private static EV3LargeRegulatedMotor rightWheel;

	

	public MoveForward(DataExchange DE) {
		DEObj = DE;
		colorSensor = new EV3ColorSensor(SensorPort.S2);
		spColor = colorSensor.getRedMode();
		sample = new float[spColor.sampleSize()];
		
		leftWheel = new EV3LargeRegulatedMotor(MotorPort.A);
		rightWheel = new EV3LargeRegulatedMotor(MotorPort.D);

	
	}

	public void run() {
		leftWheel.setSpeed(200);
		rightWheel.setSpeed(200);
		while (!Button.ESCAPE.isDown()) {

			spColor.fetchSample(sample, 0);
			float checkColor = sample[0];
//			if (DEObj.getIsObstacleDetected() == false) {
				if (DEObj.getComand()== 1) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if (checkColor < 0.1f) {

					leftWheel.setSpeed(200);
					rightWheel.setSpeed(120);

//					leftWheel.backward();
//					rightWheel.forward();
					
				} 	else if((checkColor < 0.3f) && (checkColor > 1f)) {
					leftWheel.forward();
					rightWheel.forward();
				}

				
				else {
					leftWheel.setSpeed(120);
					rightWheel.setSpeed(200);
//					leftWheel.forward();
//					rightWheel.backward();
				}
				leftWheel.forward();
				rightWheel.forward();
			}
			
//				Drive circle 1st rout
//
				else{
				leftWheel.setSpeed(128);
				rightWheel.setSpeed(300);
				
				try {
					Thread.sleep(1200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				leftWheel.setSpeed(300);
				rightWheel.setSpeed(170);
				
				
				try {
					Thread.sleep(3750);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				leftWheel.setSpeed(128);
				rightWheel.setSpeed(300);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

//				Drive circle ends

			}
				
		}
	}
}


