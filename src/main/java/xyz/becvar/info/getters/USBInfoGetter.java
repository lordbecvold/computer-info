package xyz.becvar.info.getters;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.UsbDevice;

public class USBInfoGetter {

    public String getName(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        UsbDevice usbDevice = hardware.getUsbDevices(false).get(id);
        return usbDevice.getName();
    }

    public String getUniqueDeviceId(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        UsbDevice usbDevice = hardware.getUsbDevices(false).get(id);
        return usbDevice.getUniqueDeviceId();
    }

    public String getVendor(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        UsbDevice usbDevice = hardware.getUsbDevices(false).get(id);
        return usbDevice.getVendor();
    }

    public String getProductId(int id) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        UsbDevice usbDevice = hardware.getUsbDevices(false).get(id);
        return usbDevice.getProductId();
    }
}
