package pl.pjatk.mickro;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {


    @Bean
    public Pojo pojo(){
        return new Pojo();
    }

    @Bean
    public List<String> defaultData(@Value("${my.custom.property:default_value}") String valueFromProperties){
        System.out.println(valueFromProperties);
        return List.of("A", "B", "C", "D", "E");
    }


}
