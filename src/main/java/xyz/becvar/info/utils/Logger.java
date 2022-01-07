package xyz.becvar.info.utils;

import xyz.becvar.info.Main;

public class Logger {

    //App name
    public String name = "InfoDumper";

    //App name in ascii
    public String ascii = "  _____        __        _____                                  \n" +
            " |_   _|      / _|      |  __ \\                                 \n" +
            "   | |  _ __ | |_ ___   | |  | |_   _ _ __ ___  _ __   ___ _ __ \n" +
            "   | | | '_ \\|  _/ _ \\  | |  | | | | | '_ ` _ \\| '_ \\ / _ \\ '__|\n" +
            "  _| |_| | | | || (_) | | |__| | |_| | | | | | | |_) |  __/ |   \n" +
            " |_____|_| |_|_| \\___/  |_____/ \\__,_|_| |_| |_| .__/ \\___|_|   \n" +
            "                                               | |              \n" +
            "                                               |_|              ";

    //Msg color codes
    public String ANSI_RESET = "\u001B[0m";
    public String ANSI_BLACK = "\u001B[30m";
    public String ANSI_RED = "\u001B[31m";
    public String ANSI_GREEN = "\u001B[32m";
    public String ANSI_YELLOW = "\u001B[33m";
    public String ANSI_BLUE = "\u001B[34m";
    public String ANSI_PURPLE = "\u001B[35m";
    public String ANSI_CYAN = "\u001B[36m";
    public String ANSI_WHITE = "\u001B[37m";

    //Msg Background codes
    public String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public String ANSI_RED_BACKGROUND = "\u001B[41m";
    public String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    //Print normal log to console
    public void log(String msg) {
        System.out.println(ANSI_BLUE + "[" + ANSI_GREEN + name + ANSI_BLUE + "]: " + ANSI_YELLOW + msg + ANSI_RESET);
    }

    //Print error to console in red color
    public void logError(String msg) {
        System.out.println(ANSI_BLUE + "[" + ANSI_GREEN + name + ANSI_BLUE + "]: " + ANSI_RED + msg + ANSI_RESET);
    }

    //Print log to console wwith custom prefix
    public void logWithCustomPrefix(String prefix, String msg) {
        System.out.println(ANSI_BLUE + "[" + ANSI_GREEN + prefix + ANSI_BLUE + "]: " + ANSI_YELLOW + msg + ANSI_RESET);
    }

    //Print spacer to console
    public void logSpacer(String character, int chatCount) {
        System.out.println(ANSI_CYAN + character.repeat(chatCount));
    }

    //Print empty line
    public void logEmptyLine() {
        System.out.println(" ");
    }

    //Print custom title
    public void logCustomTitle(String title) {
        System.out.println(ANSI_GREEN + title);
    }

    //Print title to console
    public void logTitle() {
        System.out.println(ANSI_RED + ascii);
    }
}
