package org.example.stand_alone_db_connection;

import org.example.stand_alone_db_connection.DAO.userRepo;
import org.example.stand_alone_db_connection.Entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StandAloneDbConnectionApplication {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(StandAloneDbConnectionApplication.class, args);

       //Create object of userRepo interface
       userRepo userRepo = context.getBean(userRepo.class);

       //Creating object of User class
       User obj = new User();

        //Adding Value in table
       obj.setFirstName("Dushyant");
       obj.setLastName("Sisodia");
       obj.setEmail("sisodiadushyant2002@gmail.com");
       obj.setPassword("@sisodia123");

       //Saving table in SQL
       userRepo.save(obj);


    }

}
