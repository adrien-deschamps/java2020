package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;

public class Wheel {
    private WPI_TalonSRX trenchWheel;


    public void initWheel() {
        trenchWheel = new WPI_TalonSRX(0);
        trenchWheel.set(Constants.INITIAZE_SPEED);
    }

    public void rotate(double speed) {
        trenchWheel.set(speed);
    }
}
