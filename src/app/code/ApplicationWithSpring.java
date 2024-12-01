package app.code;

import app.staff.administration.Director;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

//ta sama aplikacja ale z biblioteką Spring
public class ApplicationWithSpring {
    public static void main(String[] args) {

        //otrzymanie obiektu kontekstu

        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext("app.config");

        //otrzymuję Bean od Director
        Director director = context.getBean(Director.class);

        director.manageCompany();
    }
}
