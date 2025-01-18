package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
    "classpath:remote.properties"
})
public interface BrowserstackConfig extends Config {
    String appUrl();

    String project();

    @Key("android.deviceModel")
    String deviceModel();

    @Key("android.osVersion")
    String osVersion();

    @Key("ios.deviceModel")
    String iosDevice();

    @Key("ios.osVersion")
    String iosVersion();
}
