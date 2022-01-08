package xyz.becvar.info.getters;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HWIDGetter {

    public String getHWID() {
        try {
            StringBuilder s = new StringBuilder();
            final String main = System.getenv("PROCESSOR_IDENTIFIER") + System.getenv("COMPUTERNAME") + System.getProperty("user.name").trim();
            final byte[] bytes = main.getBytes(StandardCharsets.UTF_8);
            final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            final byte[] md5 = messageDigest.digest(bytes);
            int i = 0;
            for (final byte b : md5) {
                s.append(Integer.toHexString((b & 0xFF) | 0x300), 0, 3);
                if (i != md5.length - 1) {
                    s.append("-");
                }
                i++;
            }
            return s.toString();
        } catch (NoSuchAlgorithmException e) {
            xyz.becvar.info.Main.logger.logError("Please restart your computer.");
            return null;
        }
    }
}
