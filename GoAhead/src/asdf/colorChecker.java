package asdf;



import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class colorChecker {
	
	
	EV3ColorSensor colorSensor;
	SampleProvider colorProvider;
	float[] colorSample;

	public static void main(String[] args) {
		new colorChecker();

	}
	
	public colorChecker() {
		EV3ColorSensor cs1 = new EV3ColorSensor(SensorPort.S1);
		colorProvider = cs1.getRedMode();
		colorSample = new float[colorProvider.sampleSize()];
		
		//SampleProvider sp = colorSensor.getRedMode();  // get red light mode SampleProvider
		//float[] sample = new float[sp.sampleSize()];   // create array to hold sample data
		//sp.fetchSample(sample, 0);                     // fetch the first (and only) sample into the array
		//float redIntensity = sample[0];
		
		cs1.setFloodlight(true);
		while (Button.ESCAPE.isUp()) {
			colorProvider.fetchSample(colorSample, 0);
			System.out.print(colorSample[0]);
			Delay.msDelay(1000);
		}
	}

}
