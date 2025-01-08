package config;

import org.aeonbits.owner.ConfigFactory;

public class Browserstack {
    public static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());
}
