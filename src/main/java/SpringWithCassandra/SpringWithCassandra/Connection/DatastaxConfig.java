package SpringWithCassandra.SpringWithCassandra.Connection;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

import java.io.File;

//import java.io.File;


@ConfigurationProperties(prefix = "spring.datastax.astra")
public class DatastaxConfig {
    private File secureConnectBundle;

    public File getSecureConnectBundle() {
        return secureConnectBundle;
    }

    public void setSecureConnectBundle(File secureConnectBundle) {
        this.secureConnectBundle = secureConnectBundle;
    }
}
