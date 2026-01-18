package com.gevernova.javaeightfeature.Java8FeatureProblemStatements.Problem06;

public class Transaction {
    int transactionId;
    int policyNumber;
    int amount;
    String transactionDate;
    boolean isFraudulent;

    public Transaction(int amount, int policyNumber, int transactionId, String transactionDate, boolean isFraudulent) {
        this.amount = amount;
        this.policyNumber = policyNumber;
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.isFraudulent = isFraudulent;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public boolean isFraudulent() {
        return isFraudulent;
    }

    public void setFraudulent(boolean fraudulent) {
        isFraudulent = fraudulent;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", policyNumber=" + policyNumber +
                ", amount=" + amount +
                ", transactionDate='" + transactionDate + '\'' +
                ", isFraudulent=" + isFraudulent +
                '}';
    }
}
