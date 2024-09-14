package com.juaracoding.myapp_mongodb.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Builder
@Document
public class Candidate {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

}
