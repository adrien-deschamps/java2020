import edu.wpi.first.wpilibj.Spark;

public class Controllers {
    private Spark m_spark = new Spark(Constants.PORT_TRENCH);

    public void controllers() {
        m_spark.set(0);
    }
}
