/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.*;


public class driveTrain extends SubsystemBase {

  private WPI_TalonSRX leftMaster;
  private WPI_TalonSRX leftFollowerOne;
  private WPI_TalonSRX leftFollowerTwo;
  private WPI_TalonSRX rightMaster;
  private WPI_TalonSRX rightFollowerOne;
  private WPI_TalonSRX rightFollowerTwo;
  private SpeedControllerGroup leftMotorSpeedController;
  private SpeedControllerGroup rightMotorSpeedController;

  public driveTrain() {

        leftMaster = new WPI_TalonSRX(0);
        leftFollowerOne = new WPI_TalonSRX(1);
        leftFollowerTwo = new WPI_TalonSRX(2);

        leftFollowerOne.follow(leftMaster);
        leftFollowerTwo.follow(leftMaster);

        leftMotorSpeedController = new SpeedControllerGroup(leftMaster, leftFollowerOne, leftFollowerTwo);

        rightMaster = new WPI_TalonSRX(3);
        rightFollowerOne = new WPI_TalonSRX(4);
        rightFollowerTwo = new WPI_TalonSRX(5);

        rightFollowerOne.follow(rightMaster);
        rightFollowerTwo.follow(rightMaster);

        rightMotorSpeedController = new SpeedControllerGroup(rightMaster, rightFollowerOne, rightFollowerTwo);

        DifferentialDrive robotDrive = new DifferentialDrive(leftMotorSpeedController, rightMotorSpeedController);

        leftMaster.configFactoryDefault();
        leftFollowerOne.configFactoryDefault();
        leftFollowerTwo.configFactoryDefault();
        rightMaster.configFactoryDefault();
        rightFollowerOne.configFactoryDefault();
        rightFollowerTwo.configFactoryDefault();

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
