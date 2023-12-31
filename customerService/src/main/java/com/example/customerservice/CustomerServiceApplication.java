package com.example.customerservice;

import com.example.customerservice.config.GlobalConfig;
import com.example.customerservice.entities.Customer;
import com.example.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(GlobalConfig.class)
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            Customer customer1 = Customer.builder()
                    .firstName("hassan")
                    .lastName("abouabdallah")
                    .email("hassan@gmail.com")
                    .build();
            Customer customer2 = Customer.builder()
                    .firstName("karam")
                    .lastName("asraoui")
                    .email("karam@gmail.com")
                    .build();
            customerRepository.saveAll(List.of(customer1,customer2));
        };
    }
}
