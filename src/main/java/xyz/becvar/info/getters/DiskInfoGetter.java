package xyz.becvar.info.getters;

import oshi.SystemInfo;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;

public class DiskInfoGetter {

    public String getName(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        HWDiskStore disk = hardware.getDiskStores().get(id);
        return disk.getName();
    }

    public String getModel(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        HWDiskStore disk = hardware.getDiskStores().get(id);
        return disk.getModel();
    }

    public String getSerial(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        HWDiskStore disk = hardware.getDiskStores().get(id);
        return disk.getSerial();
    }

    public String getSize(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        HWDiskStore disk = hardware.getDiskStores().get(id);
        return String.valueOf(disk.getSize());
    }

    public String getTimeStamp(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        HWDiskStore disk = hardware.getDiskStores().get(id);
        return String.valueOf(disk.getTimeStamp());
    }

    public String getTransferTime(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        HWDiskStore disk = hardware.getDiskStores().get(id);
        return String.valueOf(disk.getTransferTime());
    }
}
