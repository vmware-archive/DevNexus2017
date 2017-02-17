package io.spring.cloud.samples.fortuneteller.ui.services.fortunes;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@EnableConfigurationProperties(FortuneProperties.class)
public class FortuneService {

    @Autowired
    FortuneProperties fortuneProperties;

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(groupKey="fortuneCookie", fallbackMethod = "fallbackFortune")
    public Fortune randomFortune() {
        return restTemplate.getForObject("http://fortuneservice-dotnet/api/fortunes/random", Fortune.class);
    }
    
    @HystrixCommand(groupKey="fortuneCookie", fallbackMethod = "fallbackPowerBall")
    public FortunePowerBall randomPowerBall() {
        return restTemplate.getForObject("http://powerball-docker/powerball", FortunePowerBall.class);
    }

    private Fortune fallbackFortune() {
        return new Fortune(42L, fortuneProperties.getFallbackFortune());
    }
    
    private FortunePowerBall fallbackPowerBall() {
        return new FortunePowerBall(0,0,0,0,0,0);
    }
}
