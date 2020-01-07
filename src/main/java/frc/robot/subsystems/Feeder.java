/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Feeder extends SubsystemBase {

  private Talon victor;
  /**
   * Creates a new Feeder.
   */
  public Feeder() {
    initMotor();
  }

  public void initMotor(){
    victor = new Talon(Constants.TALONSR_FEEDER_PORT);
  }

  public void setSpeed(double speed) {
     victor.set(speed);
  }

}
