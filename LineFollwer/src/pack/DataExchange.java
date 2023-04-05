package pack;

public class DataExchange {
	
	//ObstacleDetector
	private boolean obstacleDetected = false;

	//Robot has the following commands: Follow Line, Stop
	private int CMD = 1;

	public DataExchange(){

	}

	/*
	* Getters & Setters
	*/

	public void setObstacleDetected(boolean status){ obstacleDetected = status;
	}

	public boolean getObstacleDetected(){
	return obstacleDetected;
	}

	public void setCMD(int command){ CMD = command;
	}

	public int getCMD(){
	return CMD;
	}

	
}
