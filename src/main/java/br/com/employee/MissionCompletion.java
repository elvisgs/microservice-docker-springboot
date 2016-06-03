package br.com.employee;

import lombok.Data;

import java.util.Date;

@Data
public class MissionCompletion {

    private String missionId;
    private Date completionDate;
    private int pointsEarned;
}
