package asdf;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;


public class ColourDetector extends Thread {
	private DataExchange DEObj;

	private static EV3ColorSensor colorSensor;
	private static SampleProvider spColor;
	private static float[] sample;
	
	

	public ColourDetector(DataExchange DE) {
		DEObj = DE;

		colorSensor = new EV3ColorSensor(SensorPort.S2);
		spColor = colorSensor.getRedMode();
		sample = new float[spColor.sampleSize()];
	}
	

	public void run() {
	
		while (true) {
			spColor.fetchSample(sample, 0);
			float checkColor = sample[0];

			if (checkColor >= 0.04f && checkColor <= 0.1f) {
				DEObj.setIsColourDetected(1);
				//LCD.drawString("checkColor" + checkColor, 0, 1);
				
			} else if (checkColor < 0.04f) {
				DEObj.setIsColourDetected(2);
				//LCD.drawString("else if" + checkColor, 0, 1);
				
			}
			else  {
				DEObj.setIsColourDetected(3);
				//LCD.drawString("else" + checkColor, 0, 1);
			}
		}
	}
}





