package team3647robotPackage;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot 
{	
	//The speed of the robot while running the program
	double speed = 0.3;
	double distance = 5;
	double wheelcirc = 1;

	//This function is run whenever the robot starts. This function is used for any initialization of code

	Encoders encoderObject;
	public void robotInit() 
	{
encoderObject = new Encoders();
	}

	 //This function runs once, right before autonomous period starts. 

	public void autonomousInit() 
	{
	encoderObject.resetEncoders();
	}

	//This is the function that is called during the autonomous period
	//This function runs periodically, meaning it acts as an infinite loop
	
	public void autonomousPeriodic() 
	{
		double leftEncoderValue = encoderObject.getLeftEncoder();
		double rightEncoderValue = encoderObject.getRightEncoder();
		goStraight(distance);
	}
	public void goStraight(double distance) {
		if(encoderObject.getLeftEncoder() *wheelcirc<distance) {
			Motors.leftMotor.set(speed);
			
		}
		else
		{
			Motors.leftMotor.set(0);
		}
		if(encoderObject.getRightEncoder()*wheelcirc<-distance) {
			Motors.rightMotor.set(speed);
			
		}
		else {
			Motors.rightMotor.set(0);
		}
	}

	//This is the function that is called during the Tele-operated period
	//This function runs periodically, meaning it acts as an infinite loop

	public void teleopPeriodic() 
	{
		
	}

	//This is the function that is called during the test
	//Test is an option available in the driver station and can be used to test specific pieces of code.
	//This function runs periodically, meaning it acts like an infinite loop
	
	public void testPeriodic() 
	{
		
	}
}

