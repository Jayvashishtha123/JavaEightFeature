package com.gevernova.javaeightfeature.Java8FeatureProblemStatements.Problem04;

public class Claim {
    int claimId;
    int policyNumber;
    int claimAmount;
    String claimDate;
    String status;

    public Claim(int claimId, int policyNumber, String claimDate, String status, int claimAmount) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimDate = claimDate;
        this.status = status;
        this.claimAmount = claimAmount;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", policyNumber=" + policyNumber +
                ", claimAmount=" + claimAmount +
                ", claimDate='" + claimDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public int getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(int claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
