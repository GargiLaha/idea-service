package com.stackroute.postIdea.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ServiceProvider {
    @Id
    private String emailId;
    private String password;
    String name;
    String domain;
    List<String> subDomain;
    String role;
    List<String> skills;
    String about;
    String experience;
    Double chargePerHour;

    @Override
    public String toString() {
        return "ServiceProvider{" +
                "emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", subDomain=" + subDomain +
                ", role='" + role + '\'' +
                ", skills=" + skills +
                ", about='" + about + '\'' +
                ", experience='" + experience + '\'' +
                ", chargePerHour=" + chargePerHour +
                '}';
    }
}
