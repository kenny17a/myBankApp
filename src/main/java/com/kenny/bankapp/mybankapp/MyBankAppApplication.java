package com.kenny.bankapp.mybankapp;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Kenny Bank App",
                description = "Backend Rest Api for myBank",
                version = "v1.0",
                contact = @Contact(
                        name = "Kenny Ibrahim",
                        email = "ibrahimkenny17@gmail.com",
                        url = "https://github.com/kenny17a/myBankApp"
                ),
                license = @License(
                        name = "Kenny Ibrahim Code",
                        url = "https://github.com/kenny17a/myBankApp"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Java Documentation",
                url = "https://github.com/kenny17a/myBankApp"
        )
)
public class MyBankAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBankAppApplication.class, args);
    }

}
