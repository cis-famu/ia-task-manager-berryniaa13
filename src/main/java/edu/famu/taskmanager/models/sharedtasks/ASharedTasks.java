package edu.famu.taskmanager.models.sharedtasks;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.firebase.database.annotations.Nullable;
import edu.famu.taskmanager.models.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ASharedTasks {
    @DocumentId
    protected @Nullable String sharedTaskId;
    protected String taskId;
}
