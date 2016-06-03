package br.com.employee;

import lombok.Data;

import java.util.Date;

@Data
public class RewardRedeemed {

    private String rewardId;
    private Date redeemedOn;
    private int pointCost;
}
