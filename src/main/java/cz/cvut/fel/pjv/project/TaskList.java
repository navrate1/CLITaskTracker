package cz.cvut.fel.pjv.project;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class TaskList {
    private static final String FILE_PATH = "tasks.json";
    private static List<Task> tasks = new ArrayList<>();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void loadTasks() {
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
