package cz.cvut.fel.pjv.project;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static cz.cvut.fel.pjv.project.TaskList.loadTasks;

public class Main {

    public static void main(String[] args) {
        loadTasks(); // load tasks on start

        Scanner sc = new Scanner(System.in);

        boolean run = true;
        while(run) {
            System.out.println("Zadej příkaz (add, list, remove, update, help, end):  ");
            String user_input = sc.nextLine();
            switch(user_input) {
                case "add":
                    // TODO
                    break;
                case "remove":
                    // TODO
                    break;
                case "list":
                    // TODO list all, done, not done
                    break;
                case "update":
                    // TODO
                    break;
                case "help":
                    // TODO
                    break;
                case "end":
                    run = false;
                    break;
                default:
                    System.out.println("Unknown command... ");
                    break;
            }
        }
    }

}