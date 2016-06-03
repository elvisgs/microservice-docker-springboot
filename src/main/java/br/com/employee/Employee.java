package br.com.employee;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection="employees")
@Data
public class Employee {

    @Id
    private String id;

    private String email;
    private String fullName;
    private String managerEmail;
    private int totalPointsEarned;
    private int availablePoints;
    private List<MissionCompletion> completedMissions = new ArrayList<>();
    private List<RewardRedeemed> redeemedRewards = new ArrayList<>();
}