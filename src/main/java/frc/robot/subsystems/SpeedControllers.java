package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import frc.robot.Constants;

public class SpeedControllers {
    private Spark m_spark = new Spark(Constants.TRENCH_PORT);

    public void controllers() {
        m_spark.set(Constants.INITIAZE_SPEED);
    }

    public void setRotation() {
        m_spark.set(Constants.ROTATION_SPEED);
    }
}
