package cz.cvut.fel.pjv.project;

import com.fasterxml.jackson.annotation.JsonProperty; // save into json file

public class Task {
    private int taskID;
    @JsonProperty("taskName")
    private String taskName;
    private String taskDescription;
    private String taskStatus;
    private String taskCreatedDate;
    private String taskModifiedDate;

    public Task() {} // Jackson empty constructor

    public String getName() {
        return taskName;
    }

    public Task(int taskID, String taskName, String taskDescription, String taskStatus, String taskCreatedDate, String taskModifiedDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
        this.taskCreatedDate = taskCreatedDate;
        this.taskModifiedDate = taskModifiedDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskID=" + taskID +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskStatus='" + taskStatus + '\'' +
                ", taskCreatedDate='" + taskCreatedDate + '\'' +
                ", taskModifiedDate='" + taskModifiedDate + '\'' +
                '}';
    }
}
