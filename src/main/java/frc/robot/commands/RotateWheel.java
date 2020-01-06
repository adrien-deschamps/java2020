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
   * Creates a new TirerPiston.
   */
  private Wheel wheel;

  public RotateWheel(Wheel _wheel) {
    // Use addRequirements() here to declare subsystem dependencies.
    wheel =_wheel;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    wheel.rotate(Constants.INITIAZE_SPEED);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if ( == Constants.JOYSTICK_BUTTON_ROTATE)  
    wheel.rotate(Constants.ROTATION_SPEED);
    else
    wheel.rotate(Constants.INITIAZE_SPEED);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    wheel.rotate(Constants.INITIAZE_SPEED);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (timer.get() > 2) {
      return true;
    } else {
      return false;
      }
  }
}
