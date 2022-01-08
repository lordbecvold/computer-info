package xyz.becvar.info.getters;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.NetworkIF;
import java.net.Inet4Address;
import java.net.UnknownHostException;

public class NetworkInfoGetter {

    public String getName(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        NetworkIF network = hardware.getNetworkIFs().get(id);
        return network.getName();
    }

    public String getMacaddr(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        NetworkIF network = hardware.getNetworkIFs().get(id);
        return network.getMacaddr();
    }

    public long getBytesRecv(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        NetworkIF network = hardware.getNetworkIFs().get(id);
        return network.getBytesRecv();
    }

    public long getBytesSent(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        NetworkIF network = hardware.getNetworkIFs().get(id);
        return network.getBytesSent();
    }

    public String getIP() {
        try {
            return Inet4Address.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }
}

