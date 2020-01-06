package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;

public class Wheel {
    private WPI_TalonSRX trenchWheel;


    public void initWheel() {
        trenchWheel = new WPI_TalonSRX(0);
        m_spark.set(Constants.INITIAZE_SPEED);
    }

    public void setRotation() {
        m_spark.set(Constants.ROTATION_SPEED);
    }
}
