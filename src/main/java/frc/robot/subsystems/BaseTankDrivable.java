package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BaseTankDrivable extends SubsystemBase {
  
  private double leftSpeed;
  private double rightSpeed;
  //private Gyro gyro = new ADXRS450_Gyro(SPI.Port.kMXP);

  private WPI_TalonSRX left1;
  private WPI_TalonSRX left2;
  private WPI_TalonSRX right1;
  private WPI_TalonSRX right2;

  private SpeedControllerGroup leftMaster;
  private SpeedControllerGroup rightMaster;

  DifferentialDrive drive;

  public BaseTankDrivable() {
    initBase();
  }

  // Initialize the base
  private void initBase(){

    // Initialize motor controllers and drive
    left1 = new WPI_TalonSRX(0);
    left2 = new WPI_TalonSRX(1);
    right1 = new WPI_TalonSRX(2);
    right2 = new WPI_TalonSRX(3);

    leftMaster = new SpeedControllerGroup(left1, left2);
    rightMaster = new SpeedControllerGroup(right1, right2);

    drive = new DifferentialDrive(leftMaster, rightMaster);

    //gyro.calibrate();

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
