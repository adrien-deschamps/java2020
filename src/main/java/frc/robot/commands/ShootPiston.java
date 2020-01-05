/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Piston;

public class ShootPiston extends CommandBase {
  /**
   * Creates a new TirerPiston.
   */
  private Piston piston;
  private Timer timer;

  public ShootPiston(Piston _piston) {
    // Use addRequirements() here to declare subsystem dependencies.
    piston =_piston;
    addRequirements(piston);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    timer.reset();
    timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (timer.get() < 1000)  
    piston.forawrd();
    else
    piston.reverse();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    piston.turnOff();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (timer.get() > 2000) {
      return true;
    } else {
      return false;
      }
  }
}
