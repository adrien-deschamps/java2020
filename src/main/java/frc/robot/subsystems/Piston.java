/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.smartdashboard.SendableRegistry;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Piston extends SubsystemBase {
  /**
   * Creates a new Solenoide.
   */
  
   private DoubleSolenoid solenoid;

  public Piston() {
    solenoid = new DoubleSolenoid(Constants.SOLENOID_PORT_ONE,Constants.SOLENOID_PORT_TWO);
    SendableRegistry.addChild(this, solenoid);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void forawrd() {
    solenoid.set(DoubleSolenoid.Value.kForward);
  }
  
  public void reverse() {
    solenoid.set(DoubleSolenoid.Value.kReverse);
  }

  public void turnOff() {
    solenoid.set(DoubleSolenoid.Value.kOff);
  }

}
