package xyz.becvar.info;

import xyz.becvar.info.getters.*;
import xyz.becvar.info.utils.Logger;

public class Main {

    public static Logger logger = new Logger();
    public static OSInfoGetter osInfoGetter = new OSInfoGetter();
    public static HWIDGetter hwidGetter = new HWIDGetter();
    public static CPUInfoGetter cpuInfoGetter = new CPUInfoGetter();
    public static MemoryInfoGetter memoryInfoGetter = new MemoryInfoGetter();
    public static GPUInfoGetter gpuInfoGetter = new GPUInfoGetter();
    public static DiskInfoGetter diskInfoGetter = new DiskInfoGetter();
    public static NetworkInfoGetter networkInfoGetter = new NetworkInfoGetter();
    public static USBInfoGetter usbInfoGetter = new USBInfoGetter();

    public static void main(String[] args) {


        //Print welcome msg
        logger.logSpacer("=", 70);
        logger.logTitle();
        logger.logSpacer("=", 70);
        logger.logEmptyLine();



        //Print info about operating system
        logger.logCustomTitle("System");
        logger.logWithCustomPrefix("OS", osInfoGetter.getSystemName());
        logger.logWithCustomPrefix("OS arch", osInfoGetter.getOSArch());
        logger.logWithCustomPrefix("Kernel Version", osInfoGetter.getOSVersion());
        logger.logWithCustomPrefix("HWID", hwidGetter.getHWID());
        logger.logEmptyLine();



        //Print cpu information
        logger.logCustomTitle("CPU");
        logger.logWithCustomPrefix("CPU ID", String.valueOf(cpuInfoGetter.getCPUID()));
        logger.logWithCustomPrefix("CPU Arch", String.valueOf(cpuInfoGetter.getArch()));
        logger.logWithCustomPrefix("CPU Name", String.valueOf(cpuInfoGetter.getCPUName()));
        logger.logWithCustomPrefix("CPU Model", String.valueOf(cpuInfoGetter.getCPUModel()));
        logger.logWithCustomPrefix("CPU Cores", String.valueOf(cpuInfoGetter.getCPUCores()));
        logger.logWithCustomPrefix("CPU Vendor", String.valueOf(cpuInfoGetter.getCPUVendor()));
        logger.logWithCustomPrefix("CPU Endian", String.valueOf(cpuInfoGetter.getCUPEndian()));
        logger.logEmptyLine();



        //Print Ram memory information
        logger.logCustomTitle("Memory");
        logger.logWithCustomPrefix("Memory page size", memoryInfoGetter.getPageSize());
        logger.logWithCustomPrefix("Virtual Memory", memoryInfoGetter.getVirtualMemory());
        logger.logWithCustomPrefix("Memory", memoryInfoGetter.getMemory());
        logger.logEmptyLine();



        //Print GPU information
        logger.logCustomTitle("Graphics card info");
        logger.logWithCustomPrefix("GPU Version", gpuInfoGetter.getVersion(0));
        logger.logWithCustomPrefix("GPU Vendor", gpuInfoGetter.getVendor(0));
        logger.logWithCustomPrefix("GPU Name", gpuInfoGetter.getName(0));
        logger.logWithCustomPrefix("GPU VRAM", String.valueOf(gpuInfoGetter.getVRAM(0)));
        logger.logWithCustomPrefix("GPU ID", gpuInfoGetter.getID(0));
        logger.logEmptyLine();



        //Print Disks information
        logger.logCustomTitle("Disk info");
        logger.logWithCustomPrefix("Disk size", diskInfoGetter.getSize(0));
        logger.logWithCustomPrefix("Disk name", diskInfoGetter.getName(0));
        logger.logWithCustomPrefix("Disk model", diskInfoGetter.getModel(0));
        logger.logWithCustomPrefix("Disk serial", diskInfoGetter.getSerial(0));
        logger.logWithCustomPrefix("Disk time stamp", diskInfoGetter.getTimeStamp(0));
        logger.logWithCustomPrefix("Disk transfer time", diskInfoGetter.getTransferTime(0));
        logger.logEmptyLine();



        //Print Network information
        logger.logCustomTitle("Network");
        logger.logWithCustomPrefix("Adapter name", networkInfoGetter.getName(1));
        logger.logWithCustomPrefix("Bytes recv", String.valueOf(networkInfoGetter.getBytesRecv(1)));
        logger.logWithCustomPrefix("Bytes sent", String.valueOf(networkInfoGetter.getBytesSent(1)));
        logger.logWithCustomPrefix("Macadd", networkInfoGetter.getMacaddr(1));
        logger.logWithCustomPrefix("IPv4", networkInfoGetter.getIP());
        logger.logEmptyLine();



        //Print Network information
        for (int i = 0; i < 8; i++) {
            logger.logCustomTitle("USB - " + i);
            logger.logWithCustomPrefix("Device Vendor", usbInfoGetter.getVendor(i));
            logger.logWithCustomPrefix("Device name", usbInfoGetter.getName(i));
            logger.logWithCustomPrefix("Device product id", usbInfoGetter.getProductId(i));
            logger.logEmptyLine();
        }



        //Print end spacer
        logger.logSpacer("=", 70);

        //Shutdown app
        System.exit(0);
    }
}
