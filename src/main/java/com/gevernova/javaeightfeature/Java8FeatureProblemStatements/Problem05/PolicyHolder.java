package com.gevernova.javaeightfeature.Java8FeatureProblemStatements.Problem05;

public class PolicyHolder {
    String holderId;
    String  name;
    String age;
    String policyType;
    int premiumAmount;

    public PolicyHolder(String holderId, String name, String age, String policyType, int premiumAmount) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "PolicyHolder{" +
                "holderId='" + holderId + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", policyType='" + policyType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(int premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
}
