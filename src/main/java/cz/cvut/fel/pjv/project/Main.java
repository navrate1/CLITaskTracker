package cz.cvut.fel.pjv.project;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "tasks.json";
    private static List<Task> tasks = new ArrayList<>();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        loadTasks(); // load tasks on start

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Zadej příkaz (add, list, remove, update, help):  ");
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
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }

    private static void loadTasks() {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try {
                tasks = objectMapper.readValue(file, new TypeReference<List<Task>>() {});
            } catch (IOException e) {
                System.out.println("Chyba při načítání úkolů: " + e.getMessage());
            }
        }
    }
}