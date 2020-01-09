package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class BaseTankDrivable extends SubsystemBase {
  
  private double leftSpeed;
  private double rightSpeed;

  private WPI_TalonSRX left;
  private WPI_TalonSRX right;

  private SpeedControllerGroup leftMaster;
  private SpeedControllerGroup rightMaster;

  //private Solenoid solenoid ;

  DifferentialDrive drive;

  public BaseTankDrivable() {
    //solenoid = new Solenoid(0);
    initBase();
  }

  // Initialize the base
  private void initBase(){

    // Initialize motor controllers and drive
    left = new WPI_TalonSRX(Constants.TALONSRX_TANK_LEFT_PORT);
    right = new WPI_TalonSRX(Constants.TALONSRX_TANK_RIGHT_PORT);

    leftMaster = new SpeedControllerGroup(left);
    rightMaster = new SpeedControllerGroup(right);

    drive = new DifferentialDrive(leftMaster, rightMaster);


  }

  // Updates the new speeds indicated by the joysticks
  public void setSpeed(double lSpeed, double rSpeed){
    this.leftSpeed = lSpeed;
    this.rightSpeed = rSpeed;
  }

  @Override
  public void periodic() {

      drive.tankDrive(leftSpeed, rightSpeed);

    }
}
