package edu.famu.taskmanager.models.messages;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;
import edu.famu.taskmanager.models.util.Utility;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class RestMessages extends AMessages {
    private DocumentReference senderId;
    private DocumentReference receiverId;

    public RestMessages(String messageId, String content, Timestamp timestamp, DocumentReference senderId, DocumentReference receiverId) {
        super(messageId, content, timestamp);
        this.senderId = senderId;
        this.receiverId = receiverId;
    }

    public void setSenderId(String senderId) {
        this.senderId = Utility.retrieveDocumentReference("Users", senderId);
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = Utility.retrieveDocumentReference("Users", receiverId);
    }
}
