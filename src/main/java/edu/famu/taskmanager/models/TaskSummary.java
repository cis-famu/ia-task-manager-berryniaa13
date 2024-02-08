package edu.famu.taskmanager.models;

import com.google.cloud.Timestamp;
import com.google.firebase.database.annotations.Nullable;
import edu.famu.taskmanager.models.tasks.ATasks;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class TaskSummary extends ATasks {

    public TaskSummary(@Nullable String taskId, String title, String description, String status, Timestamp createdAt, @Nullable Timestamp updatedAt, @Nullable List<Object> comments, Timestamp dueDate, List<String> labels) {
        super(taskId, title, description, status, createdAt, updatedAt, comments, dueDate, labels);
    }
}