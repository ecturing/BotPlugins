package org.example.autocofig;

import org.example.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfig {
    @Bean("")
    public Service Run(){
        return new Service();
    }
}
