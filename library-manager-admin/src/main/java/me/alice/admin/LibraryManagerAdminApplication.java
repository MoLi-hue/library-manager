package me.alice.admin;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class LibraryManagerAdminApplication {

    static void main(String... args) {
        log.info("开始运行");
        SpringApplication.run(LibraryManagerAdminApplication.class, args);
    }

}
