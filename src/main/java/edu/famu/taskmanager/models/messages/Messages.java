package edu.famu.taskmanager.models.messages;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;
import edu.famu.taskmanager.models.Users;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Messages extends AMessages{
    private Users senderId;
    private Users receiverId;

    public Messages(String messageId, String content, Timestamp timestamp, Users senderId, Users receiverId) {
        super(messageId, content, timestamp);
        this.senderId = senderId;
        this.receiverId = receiverId;
    }
}
