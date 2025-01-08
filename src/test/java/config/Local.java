package config;

import org.aeonbits.owner.ConfigFactory;

public class Local {
    public static LocalConfig config = ConfigFactory.create(LocalConfig.class, System.getProperties());
}
