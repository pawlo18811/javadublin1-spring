package pl.sda.javadublin1spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.javadublin1spring.user.FileBasedUserRepository;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Javadublin1SpringApplication {

    @Autowired
    private HelloBean helloBean;

    @Autowired
    private FileBasedUserRepository fileBasedUserRepository;

    public static void main(String[] args) {
        SpringApplication.run(Javadublin1SpringApplication.class, args);
        System.out.println("blabal");

    }

    @PostConstruct
    public void run() {
        helloBean.hello();
    }
}
