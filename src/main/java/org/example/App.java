package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        ApplicationContext factorym = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Mid m = factorym.getBean(Mid.class);
        m.config();
        m.getStringDate();

        ApplicationContext factoryf = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Final f = factoryf.getBean(Final.class);
        f.config();
        f.getStringDate();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter date : ");
        String date = myObj.nextLine();

        if(date.equals(m.getStringDate())){
            System.out.println("MidTerm Exam");
        }
        else if(date.equals(f.getStringDate())){
            System.out.println("FinalTerm Exam");
        }
    }
}
