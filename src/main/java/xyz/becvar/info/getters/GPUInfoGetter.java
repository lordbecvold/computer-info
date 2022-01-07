package xyz.becvar.info.getters;

import oshi.SystemInfo;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;

public class GPUInfoGetter {

    public String getName(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        GraphicsCard gpu = hardware.getGraphicsCards().get(id);
        return gpu.getName();
    }

    public String getVendor(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        GraphicsCard gpu = hardware.getGraphicsCards().get(id);
        return gpu.getVendor();
    }

    public String getID(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        GraphicsCard gpu = hardware.getGraphicsCards().get(id);
        return gpu.getDeviceId();
    }

    public String getVersion(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        GraphicsCard gpu = hardware.getGraphicsCards().get(id);
        return gpu.getVersionInfo();
    }

    public long getVRAM(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        GraphicsCard gpu = hardware.getGraphicsCards().get(id);
        return gpu.getVRam();
    }
}

