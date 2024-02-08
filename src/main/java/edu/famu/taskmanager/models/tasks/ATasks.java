package edu.famu.taskmanager.models.tasks;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.firebase.database.annotations.Nullable;
import com.google.protobuf.util.Timestamps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.text.ParseException;
import java.util.List;

@Data
    @AllArgsConstructor
    @NoArgsConstructor
    public abstract class ATasks {
        @DocumentId
        protected @Nullable String taskId;
        protected String title;
        protected String description;
        protected String status;
        protected Timestamp createdAt;
        protected @Nullable Timestamp updatedAt;
        protected @Nullable List<Object> comments;
        protected Timestamp dueDate;
        protected List<String> labels;

        public void setCreatedAt(String createdAt) throws ParseException {
            this.createdAt = Timestamp.fromProto(Timestamps.parse(createdAt));
        }

        public void setUpdatedAt(String updatedAt) throws ParseException {
            this.updatedAt = Timestamp.fromProto(Timestamps.parse(updatedAt));
        }

        public void updateUpdateDateTime(Timestamp updatedAt) { this.updatedAt = updatedAt; }


        public void setDueDate(String dueDate) throws ParseException {
            this.dueDate = Timestamp.fromProto(Timestamps.parse(dueDate));
        }

        public void updateDueDateTime(Timestamp dueDate) { this.dueDate = dueDate; }

    }

