package edu.famu.taskmanager.models.sharedtasks;


import edu.famu.taskmanager.models.Users;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class SharedTasks extends ASharedTasks {
    private List<Users> sharedWithUsers;

    public SharedTasks(String sharedTaskId, String taskId, List<Users> sharedWithUsers) {
        super(sharedTaskId, taskId);
        this.sharedWithUsers = sharedWithUsers;
    }
}
