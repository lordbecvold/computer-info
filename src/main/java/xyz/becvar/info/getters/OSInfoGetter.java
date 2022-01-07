package xyz.becvar.info.getters;

public class OSInfoGetter {

    public String getSystemName() {

        String os = System.getProperty("os.name");
        if (os.contains("linux") || os.contains("Linux")) {
            os = "Linux AKA better than windows";
        } else if (os.contains("Windows") || os.contains("windows") || os.contains("win")){
            os = "Windows AKA the bad system";
        }

        return os;
    }

    public String getOSVersion() {
        return System.getProperty("os.version");
    }

    public String getOSArch() {
        return System.getProperty("os.arch");
    }
}
