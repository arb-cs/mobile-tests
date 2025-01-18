package config;

import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath:local.properties"
})
public interface LocalConfig extends Config {
    String platformVersion();
    String deviceName();
    String appPackage();
    String appActivity();
}
