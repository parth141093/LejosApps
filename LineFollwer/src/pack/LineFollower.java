package pack;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class LineFollower extends Thread { 
	DataExchange DEObj;

	private EV3LargeRegulatedMotor evc;
	
	ev = new EV3LargeRegulatedMotor(22);
	
//	private  EV3UltrasonicSensor us1;
//	p
//	private final int colorPattern = 45;
//
//	public LineFollower(DataExchange DE){ 
//		DEObj = DE;
//
//	ss1 = new EV3ColorSensor(SensorPort.S1);
//	us1 = new EV3UltrasonicSensor(SensorPort.S2);
//
//	ss1.setFloodlight(45);
//	
//	final SampleProvider sp = us1.getDistanceMode();
//    int distanceValue = 0;
//    
//    while(true) {
//        float [] sample = new float[sp.sampleSize()];
//        sp.fetchSample(sample, 0);
//        distanceValue = (int)(sample[0]*100);
//
//        System.out.println("Distance: " + distanceValue);
//        
//        if(distanceValue == 30)
//        {
//        	ss1.setFloodlight(45);
//        }
//        
//        Delay.msDelay(500);
//        
//        if(Button.getButtons()!=0) {
//            break;
//        }
//        
//    }
	
//	run(us1);
	}

	public void run(){
		//Infinite Task
		
	}
}

