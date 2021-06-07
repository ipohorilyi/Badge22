package day48_constructors_static;

import java.util.Arrays;
import java.util.Scanner;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");

        group1.addmembers("Berk");
        group1.addmembers("Pavel");
        group1.addmembers("Elvin");
        group1.addmembers("Ali");
        group1.addmembers("Berk");
        group1.addmembers("Rasim");
        group1.addmembers("Maria");
        System.out.println( group1.getMembers().size());
        System.out.println(group1.getMembers());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen","Akrem", "Andrei"));
        System.out.println("group2 = " + group2.getMembers());

        if (group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is not in group2");
        }
        group1.removeMember("Ali");
        System.out.println(group1.getMembers());



    }
}
