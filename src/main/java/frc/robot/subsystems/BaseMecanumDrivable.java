/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;


public class BaseMecanumDrivable extends SubsystemBase {

  
  private double speedX;
  private double speedY;
  private double speedZ;
  private Gyro gyro = new ADXRS450_Gyro(SPI.Port.kMXP);

  private WPI_TalonSRX leftFront;
  private WPI_TalonSRX leftRear;
  private WPI_TalonSRX rightFront;
  private WPI_TalonSRX rightRear;

  private SpeedController leftFrontMotor;
  private SpeedController leftRearMotor;
  private SpeedController rightFrontMotor;
  private SpeedController rightRearMotor;

  MecanumDrive drive;

  public BaseMecanumDrivable() {
    initBase();
  }

  // Initialize the base
  private void initBase(){

    // Initialize motor controllers and drive
    leftFront = new WPI_TalonSRX(0);
    leftRear = new WPI_TalonSRX(1);
    rightFront = new WPI_TalonSRX(2);
    rightRear = new WPI_TalonSRX(3);

    leftFrontMotor = new SpeedControllerGroup(leftFront);
    leftRearMotor = new SpeedControllerGroup(leftRear);
    rightFrontMotor = new SpeedControllerGroup(rightFront);
    rightRearMotor = new SpeedControllerGroup(rightRear);

    drive = new MecanumDrive(leftFrontMotor, leftRearMotor, rightFrontMotor, rightRearMotor);


    gyro.calibrate();

  }
// Updates the new speeds indicated by the joysticks
public void setSpeed(double speedY, double speedX, double speedZ){
    this.speedY = speedY;
    this.speedX = speedY;
    this.speedZ = speedZ;
  }

  @Override
  public void periodic() {

    drive.driveCartesian(speedY, speedX, speedZ, gyro.getAngle());;

    }
}
