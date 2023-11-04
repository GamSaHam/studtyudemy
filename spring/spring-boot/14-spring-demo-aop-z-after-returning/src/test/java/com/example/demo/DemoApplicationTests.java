package com.example.demo;

import com.example.demo.config.DemoConfig;
import com.example.demo.dao.AccountDAO;
import com.example.demo.dao.MembershipDAO;
import com.example.demo.model.Account;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {


    @Test
    void addReviewAndCourses() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        List<Account> accountList = null;


        try{
            // add a boolean flag to simulate exceptions

            boolean tripWire = true;
            accountList = accountDAO.findAccounts(tripWire);

        }catch (Exception exc){
            System.out.println("\n\nMain Program ... caught exception: "+ exc);
        }

        //display the accounts
        System.out.println("\n\nMain Program: AfterReturningDemoApp");
        System.out.println("-----");

        System.out.println(accountList);



        context.close();
    }





}
