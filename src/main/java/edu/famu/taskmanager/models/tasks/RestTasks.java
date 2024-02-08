package edu.famu.taskmanager.models.tasks;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;
import edu.famu.taskmanager.models.util.Utility;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


    @Data
    @NoArgsConstructor
    public class RestTasks extends ATasks {

        private List<DocumentReference> assignedUsers;
        private DocumentReference createdBy;
        private List<DocumentReference> checklist;

        public RestTasks(String taskId, String title, String description, String status, Timestamp createdAt, Timestamp updatedAt, List<Object> comments, Timestamp dueDate, List<String> labels, List<DocumentReference> assignedUsers, DocumentReference createdBy, List<DocumentReference> checklist) {
            super(taskId, title, description, status, createdAt, updatedAt, comments, dueDate, labels);

            this.assignedUsers = assignedUsers;
            this.createdBy = createdBy;
            this.checklist = checklist;
        }
        // Setters and Getters for String parameters to perform Firestore queries

        public void setCreatedBy(String createdBy) {
            // Perform Firebase Firestore query to retrieve DocumentReference for createBy
            this.createdBy = Utility.retrieveDocumentReference("Users", createdBy);
        }

        public void setAssignedUsers(ArrayList<String> assignedUsers) {

            this.assignedUsers = new ArrayList<>();
            for(String user : assignedUsers) {
                this.assignedUsers.add(Utility.retrieveDocumentReference("Users", user));
            }
        }
        public void setChecklist(ArrayList<String> checklists) {

            this.checklist = new ArrayList<>();
            for(String listId: checklists) {
                this.checklist.add(Utility.retrieveDocumentReference("ChecklistItem", listId));
            }

        }
    }
