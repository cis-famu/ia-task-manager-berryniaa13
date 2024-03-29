package edu.famu.taskmanager.models;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.firebase.database.annotations.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

    @Data //creates setters and getters automatically
    @AllArgsConstructor //creates constructor with all values automatically
    @NoArgsConstructor //creates no argument constructor automatically
    public class Users {
        @DocumentId
        private @Nullable String userId;
        private String username;
        private String email;
        private List<String> roles;
        private String image;

    }

