package de.neuefische.studendb;

import de.neuefische.studendb.model.BiologyStudent;
import de.neuefische.studendb.model.EconomicsStudent;
import de.neuefische.studendb.model.Student;

public class AppMain {

    public static void main(String[] args) {

        BiologyStudent bStudent1 = new BiologyStudent("Mark", "42", "6");
        EconomicsStudent eStudent1 = new EconomicsStudent("Justus", "1", "3");

        System.out.println(bStudent1);
        System.out.println(eStudent1);

    }

}
