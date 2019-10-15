import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int maxConnections;

    public Network(String name, int maxConnections){
        this.devices = new ArrayList<IConnect>();
        this.name = name;
        this.maxConnections = maxConnections;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device){
        if (this.slotsFree() >= 1) {
            devices.add(device);
        }
    }

    public void disconnectAll(){
        devices.clear();
    }

    public int slotsFree() {
        return this.maxConnections - this.deviceCount();
    }
}