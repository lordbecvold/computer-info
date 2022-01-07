package xyz.becvar.info.getters;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

public class CPUInfoGetter {

    public String getCPUName() {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();
        return String.valueOf(processor.getProcessorIdentifier().getName());
    }

    public String getCPUID() {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();
        return String.valueOf(processor.getProcessorIdentifier().getProcessorID());
    }

    public String getCPUModel() {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();
        return String.valueOf(processor.getProcessorIdentifier().getModel());
    }

    public String getCPUVendor() {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();
        return String.valueOf(processor.getProcessorIdentifier().getVendor());
    }

    public String getArch() {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();
        if (processor.getProcessorIdentifier().isCpu64bit()) {
            return "x64";
        } else {
            return "x86";
        }
    }

    public int getCPUCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    public String getCUPEndian() {
        return System.getProperty("sun.cpu.endian");
    }
}
