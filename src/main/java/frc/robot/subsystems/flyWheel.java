/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
/*
package frc.robot.subsystems;

import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.shootBalls;


public class flyWheel extends SubsystemBase {

  //definition of Spark MAX
  private CANSparkMax flyWheelMaster;
  private CANSparkMax flyWheelFollower;

  private final SpeedControllerGroup flyWheelGroup;

  private CANPIDController pidController;
  //private CANEncoder encoder;
  public double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput;




  public flyWheel() {
    //instantiation of motor controller
    flyWheelMaster = new CANSparkMax(Constants.flyWheelMaster, MotorType.kBrushless);
    flyWheelFollower = new CANSparkMax(Constants.flyWheelFollower, MotorType.kBrushless);

    //sets factory defaults of motor controller
    flyWheelMaster.restoreFactoryDefaults();
    flyWheelMaster.setIdleMode(IdleMode.kBrake);

    flyWheelFollower.restoreFactoryDefaults();
    flyWheelFollower.setIdleMode(IdleMode.kBrake);
    flyWheelFollower.isFollower();
    flyWheelFollower.setInverted(true);

    flyWheelGroup = new SpeedControllerGroup(flyWheelMaster, flyWheelFollower);

    pidController = flyWheelMaster.getPIDController();
    //encoder = flyWheelMaster.getEncoder();

    kP = Constants.kP; 
    kI = Constants.kI;
    kD = Constants.kD; 
    kIz = Constants.kIz; 
    kFF = Constants.kFF; 
    kMaxOutput = Constants.kMaxOutput; 
    kMinOutput = Constants.kMinOutput;


    pidController.setP(kP);
    pidController.setI(kI);
    pidController.setD(kD);
    pidController.setIZone(kIz);
    pidController.setFF(kFF);
    pidController.setOutputRange(kMinOutput, kMaxOutput);


    //double setPoint = (Right here will be the desired RPM of the motor based on a distance);
    //pidController.setReference(setPoint, ControlType.kVelocity);
  }

    





  //function which sets speed of motor if button is held
  public void shootBallsIn(){
      flyWheelGroup.set(.3);
  }





  //function which sets speed of motor forward if button is held
  public void shootBallsOut() {
      flyWheelGroup.set(-.3);
  }
  //function which sets speed of motor if button is not held
  public void stopShootingBalls() {
      flyWheelGroup.set(0);
  }





  //sets the initial command of the subsystem (found under commands folder)
  protected void initDefaultCommand() {
      setDefaultCommand(new shootBalls());
  }




  
  @Override
  public void periodic() {
    //System.out.println("Voltage: " + intakeFolderMotor.getBusVoltage());
    //System.out.println("Temperature: " + intakeFolderMotor.getMotorTemperature());
    //System.out.println("Output: " + intakeFolderMotor.getAppliedOutput());
  }
}*/
