package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Final implements Exam{
    @Value("${my.date.final}")
    String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void config() {
        System.out.println("Final Term Date : " + date);
        // cpu.process();
    }
    public String getStringDate(){
        return date;
    }
}
