package pl.wpe.springconfig.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import pl.wpe.springconfig.config.AkeConfig;

@Component
public class ConfigInfoContributor implements InfoContributor {
    @Autowired
    private AkeConfig config;

    @Override
    public void contribute(Info.Builder builder) {

        builder.withDetail("CONFIG",config.toString());
    }
}
