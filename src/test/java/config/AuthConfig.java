package config;

import org.aeonbits.owner.Config;
@Config.Sources("system:properties")
public interface AuthConfig extends Config {
    String name();
    String password();
}
