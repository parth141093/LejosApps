
public class DataExchange {

	//Robot has the following commands: Follow Line, Stop
	private boolean isObstacleDetected = false;
//	private boolean isColourDetected = false;
	private float comand = 0;
	public float getComand() {
		return comand;
	}

	public void setComand(float comand) {
		this.comand = comand;
	}

	/*
	* Getters & Setters
	*/
	public void setIsObstacleDetected(boolean command){ 
		isObstacleDetected  = command;
	}

	public boolean getIsObstacleDetected(){
		return isObstacleDetected;
	}

//	public void setIsColourDetected(boolean command){ 
//		isColourDetected  = command;
//	}
//
//	public boolean getIsColourDetected(){
//		return isColourDetected;
//	}
}
