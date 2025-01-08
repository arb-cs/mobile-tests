package config;

import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath:local.properties"
})
public interface LocalConfig extends Config {
    @Key("platfromVersion")
    String platfromVersion();

    @Key("deviceName")
    String deviceName();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();
}
