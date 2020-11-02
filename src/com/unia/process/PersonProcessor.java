package com.unia.process;

import com.unia.common.Neofit;

import java.util.Date;

public class PersonProcessor {
    public Neofit createNeofit(String fName, String lName, Date birth, String work) {
        
        Neofit neo = new Neofit();
        neo = new Neofit();
        neo.setWork(work);
        neo.setBirthDate(birth);
        neo.setFirstName(fName);
        neo.setLastName(lName);


        return neo;
    }
}
