package com.schuanhe.plook.override;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class OverrideSrpingApplication implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        if (!new File("env").isFile()) {
            new File("env").createNewFile();
        }
    }
}
