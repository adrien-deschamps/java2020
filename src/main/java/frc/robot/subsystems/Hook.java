/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Hook extends SubsystemBase {
  /**
   * Creates a new hook.
   */

  private Talon talon;

  public Hook() {
    initMotor();
  }

  private void initMotor() {
    talon = new Talon(6);
  }
  
  public void setSpeed(double speed) {
    talon.setSpeed(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
