package asdf;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class MoveForward extends Thread {
	DataExchange DEObj;

	private static EV3LargeRegulatedMotor leftWheel;
	private static EV3LargeRegulatedMotor rightWheel;

	public MoveForward(DataExchange DE) {
		DEObj = DE;
		leftWheel = new EV3LargeRegulatedMotor(MotorPort.A);
		rightWheel = new EV3LargeRegulatedMotor(MotorPort.D);

		leftWheel.setSpeed(250);
		rightWheel.setSpeed(250);
	}

	public void run() {
		// Infinite Task
		while (true) {
			
			  if (DEObj.getnoDetections() == 2) {
		            // Break out of the loop when noDetections is 2
				 
				  leftWheel.stop();
				  rightWheel.stop();
				  
				  break;				
		          
			  }
			  
			  
			  
			  else if (!DEObj.getIsObstacleDetected() && DEObj.getIsColourDetected() == 1) {
				leftWheel.forward();
				rightWheel.forward();
			//
				}
				
	
				
			else if(!DEObj.getIsObstacleDetected() ) {
					
			     if (DEObj.getIsColourDetected() == 2) {
					
					//turn left				
			    	 
			    	 
			    	 leftWheel.setSpeed(150);
		                rightWheel.setSpeed(60);
		                leftWheel.forward();
		                rightWheel.forward();
			    	 
			    	 
			    	   
			    	    		    	 
			    		            
										
				}
			      else if (DEObj.getIsColourDetected() == 3) {
				 
				//turn right
			    	    leftWheel.setSpeed(60);
		                rightWheel.setSpeed(150);
		                leftWheel.forward();
		                rightWheel.forward();
			    	 
							
			    	  
				    
			    }
				}
		else if(DEObj.getIsObstacleDetected()) {	
			
			
			
			//takes left turn for 0.7sec
			leftWheel.setSpeed(300);
            rightWheel.setSpeed(100);
            leftWheel.forward();
            rightWheel.forward();
            Delay.msDelay(900);
    	 
            leftWheel.setSpeed(150);
            rightWheel.setSpeed(150);
            leftWheel.forward();
            rightWheel.forward();
            Delay.msDelay(2000);
             
            
            leftWheel.setSpeed(100);
            rightWheel.setSpeed(300);
            leftWheel.forward();
            rightWheel.forward();
            Delay.msDelay(1600);
    	  
            		
 			
 			
 			while(DEObj.getIsColourDetected() == 3) {
 			
 			//takes left right for 0.7sec
			 leftWheel.setSpeed(100);
             rightWheel.setSpeed(100);
             leftWheel.forward();
             rightWheel.forward();
	    	
	    	
	    	
	    	 
            
 			}
       
            
				  
			  
			   }
			
			
		      
			
			
			
			
				
		
		}
	}
}
