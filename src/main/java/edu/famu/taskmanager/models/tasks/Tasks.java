package edu.famu.taskmanager.models.tasks;

import com.google.cloud.Timestamp;
import edu.famu.taskmanager.models.ChecklistItem;
import edu.famu.taskmanager.models.Users;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


    @Data
    @NoArgsConstructor
    public class Tasks extends ATasks {

        private List<Users> assignedUsers;
        private Users createdBy;
        private List<ChecklistItem> checklist;

        public Tasks(String taskId, String title, String description, String status, Timestamp createdAt, Timestamp updatedAt, List<Object> comments, Timestamp dueDate, List<String> labels, List<Users> assignedUsers, Users createdBy, List<ChecklistItem> checklist) {
            super(taskId, title, description, status, createdAt, updatedAt, comments, dueDate, labels);

            this.assignedUsers = assignedUsers;
            this.createdBy = createdBy;
            this.checklist = checklist;
        }

    }


