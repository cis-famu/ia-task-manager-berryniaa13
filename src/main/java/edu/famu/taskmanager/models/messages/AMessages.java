package edu.famu.taskmanager.models.messages;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.firebase.database.annotations.Nullable;
import com.google.protobuf.util.Timestamps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;


@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AMessages {
    @DocumentId
    protected @Nullable String messageId;
    protected String content;
    protected Timestamp timestamp;

    public void setTimestamp(String timestamp) throws ParseException {
        this.timestamp = Timestamp.fromProto(Timestamps.parse(timestamp));
    }

}
