/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ConveyorCommand;
import frc.robot.commands.FeederCommand;
import frc.robot.commands.HookCommand;
import frc.robot.commands.MoveTankRobot;
import frc.robot.commands.RouletteCommand;
import frc.robot.commands.ShootTheBall;
import frc.robot.subsystems.BaseTankDrivable;
import frc.robot.subsystems.Conveyor;
import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Hook;
import frc.robot.subsystems.Launcher;
import frc.robot.subsystems.Roulette;
import edu.wpi.first.wpilibj.XboxController;
//import frc.robot.commands.ShootPiston;
//import frc.robot.subsystems.Piston;
//import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  
  //private final Piston m_piston = new Piston();
  //private final Joystick m_joystick = new Joystick(Constants.JOYSTICK_PORT);
  //private final ShootPiston m_shootPison = new ShootPiston(m_piston);

  private Joystick joystick1;
  private Joystick joystick2;

  private BaseTankDrivable bTankDrivable;
  private Feeder feeder;
  private Conveyor mConveyor;
  private Hook mHook;
  private Launcher mLauncher;
  private Roulette mRoulette;

  private RouletteCommand mRouletteCommand;
  private ShootTheBall mShoot;
  private HookCommand mHookCommand;
  private ConveyorCommand mConveyorCommand;
  private FeederCommand mFeederCommand;
  private MoveTankRobot mTankRobot;

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    bTankDrivable.setDefaultCommand(mTankRobot);
    mLauncher.setDefaultCommand(mShoot);
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    mHook = new Hook();
    mLauncher = new Launcher();
    mRoulette = new Roulette();
    bTankDrivable = new BaseTankDrivable();
    joystick1 = new Joystick(0);
    joystick2 = new Joystick(1);
    feeder = new Feeder();
    mConveyor = new Conveyor();
    mConveyorCommand = new ConveyorCommand(mConveyor);
    mFeederCommand = new FeederCommand(feeder);
    mTankRobot = new MoveTankRobot(bTankDrivable, joystick1);
    mRouletteCommand = new RouletteCommand(mRoulette);
    mHookCommand = new HookCommand(mHook);
    mShoot = new ShootTheBall(mLauncher, joystick2);



    new JoystickButton(joystick1, Constants.JOYSTICK_BUTTON_SHOOT).whenHeld(mFeederCommand);
    new JoystickButton(joystick2, 1).whenHeld(mConveyorCommand);
    new JoystickButton(joystick1, Constants.JOYSTICK_BUTTON_ROULETTE).whenHeld(mRouletteCommand);



    //new JoystickButton(m_joystick, Constants.JOYSTICK_BUTTON_SHOOT).whenPressed(m_shootPison);
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    // return m_autoCommand;
    return mTankRobot;
  }
}
