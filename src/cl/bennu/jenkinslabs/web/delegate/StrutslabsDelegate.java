package cl.bennu.jenkinslabs.web.delegate;

public class StrutslabsDelegate {

    private static final StrutslabsDelegate instance = new StrutslabsDelegate();

    private StrutslabsDelegate() {
    }

    public static StrutslabsDelegate getInstance() {
        return instance;
    }


}
