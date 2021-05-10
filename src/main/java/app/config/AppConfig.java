package app.config;

import app.model.AnimalsCage;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name="animalsCage")
    public AnimalsCage getAnimalsCage() {
        AnimalsCage animalsCage = new AnimalsCage();
        return animalsCage;
    }
    @Bean(name="timer")
    public Timer getTimer(){
        Timer timer = new Timer();
        return timer;
    }
}
