/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Launcher extends SubsystemBase {
  /**
   * Creates a new Launcher.
   */
  private WPI_TalonSRX motor;

  public Launcher() {
    initMotor();
  }

  private void initMotor() {
    motor = new WPI_TalonSRX(Constants.TALONSRX_LAUNCHER_PORT);
  }

  public void setSpeed(double speed) {
    motor.set(speed*-1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
