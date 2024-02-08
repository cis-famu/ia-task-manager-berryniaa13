package edu.famu.taskmanager.models.sharedtasks;

import com.google.cloud.firestore.DocumentReference;
import edu.famu.taskmanager.models.Users;
import edu.famu.taskmanager.models.util.Utility;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class RestSharedTasks extends ASharedTasks{
    private List<DocumentReference> sharedWithUsers;

    public RestSharedTasks(String sharedTaskId, String taskId, List<DocumentReference> sharedWithUsers) {
        super(sharedTaskId, taskId);
        this.sharedWithUsers = sharedWithUsers;
    }

    public void setSharedWithUsers(ArrayList<String> sharedWithUsers) {
        this.sharedWithUsers = new ArrayList<>();
        for(String user : sharedWithUsers) {
            this.sharedWithUsers.add(Utility.retrieveDocumentReference("Users", user));
        }
    }
}
