public class InternetRadio implements IConnect {

    public static String tune(String station) {
        return "Tuned to " + station;
    }

    public String connect(String data) {
        return "connecting to network: " + data;
    }
}
