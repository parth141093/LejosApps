package asdf;


public class DataExchange {

	//Robot has the following commands: Follow Line, Stop
	private boolean isObstacleDetected = false;
	private int isColourDetected;
	private int noDetections;
	/*
	* Getters & Setters
	*/
	public void setIsObstacleDetected(boolean command){ 
		isObstacleDetected  = command;
	}

	public boolean getIsObstacleDetected(){
		return isObstacleDetected;
	}

	public void setIsColourDetected(int i){ 
		isColourDetected  = i;
	}

	public int getIsColourDetected(){
		return isColourDetected;
	}
	
	public void setnoDetections(int i){ 
		noDetections  = i;
	}
	public int getnoDetections(){
		return noDetections;
	}
}
