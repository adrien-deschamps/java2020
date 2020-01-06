/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Piston;
import frc.robot.subsystems.Wheel;

public class RotateWheel extends CommandBase {
  /**
   * Creates a new wheel for trench.
   */
  private Wheel wheel;
  private int lastColor; // temporary variable type for color... to be changed
  private int currentColor;
  private int counter;

  public RotateWheel(Wheel _wheel) {
    // Use addRequirements() here to declare subsystem dependencies.
    wheel =_wheel;
    counter = 0;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    wheel.rotate(Constants.INITIAZE_SPEED);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // get color from sensor; currentColor = sensor.color;
    wheel.rotate(Constants.ROTATION_SPEED);
    if (lastColor != currentColor)
      counter++;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    wheel.rotate(Constants.INITIAZE_SPEED);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (counter > Constants.NB_OF_WHEEL_SLICES) {
      counter = 0;
      return true;
    } else {
      return false;
    }
  }
}
