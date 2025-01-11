package helpers;

import static config.Browserstack.config;

public class EnvironmentHelper {

    // Platform config
    public static final String platform = System.getProperty("platform", "android");
    public static final String deviceHost = System.getProperty("deviceHost", "emulation");
    public static boolean isBrowserstack = deviceHost.equals("browserstack");
    public static boolean isEmulation = deviceHost.equals("emulation");

    // Browserstack config
    public static final String bsLogin = System.getProperty("bs_login", config.login());
    public static final String bsPassword = System.getProperty("bs_password", config.password());

    // Android config
    public static final boolean isAndroid = platform.equals("android");
    public static final String androidDevice = System.getProperty("device_model", config.deviceModel());
    public static final String androidVersion = System.getProperty("os_version", config.osVersion());
    public static final String androidBrowserstackApp = System.getProperty("bs_app", config.appUrl());

    // IOS config
    public static final boolean isIos = platform.equals("ios");
    public static final String iosDevice = System.getProperty("device_model", config.iosDevice());
    public static final String iosVersion = System.getProperty("os_version", config.iosVersion());
    public static final String iosBrowserstackApp = System.getProperty("bs_app", config.appUrl());
}
