package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import frc.robot.Constants;

public class SpeedControllers {
    private Spark m_spark = new Spark(Constants.PORT_TRENCH);

    public void controllers() {
        m_spark.set(0);
    }
}
