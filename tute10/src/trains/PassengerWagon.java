package trains;

public class PassengerWagon extends Wagon {
    public static final String TYPE = "PassengerWagon";
    public static final int POWER_REQUIRED = 500;

    public PassengerWagon() {
        super(TYPE);
    }

    public int getPowerDelta() {
        return -1 * POWER_REQUIRED;
    }

}
