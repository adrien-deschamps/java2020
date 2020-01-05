/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.BaseTankDrivable;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class MoveTankRobot extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private BaseTankDrivable m_base;
    private double coordY1;
    private double coordY2;
  
    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public void MoveRobotTank(BaseTankDrivable base, double coordY1, double coordY2) {
      m_base = base;
      this.coordY1 = coordY1;
      this.coordY2 = coordY2;
      addRequirements(m_base);
    }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      m_base.setSpeed(coordY1, coordY2);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
