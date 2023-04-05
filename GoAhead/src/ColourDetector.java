import lejos.hardware.lcd.LCD;
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

//			DEObj.setComand(checkColor);
		}
	}
}
