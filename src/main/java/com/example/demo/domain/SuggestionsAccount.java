package com.example.demo.domain;

public class SuggestionsAccount {
    private int id;
    private String accountName;
    private String accountCategory;

    public SuggestionsAccount(int id, String accountName, String accountCategory) {
        this.id = id;
        this.accountName = accountName;
        this.accountCategory = accountCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountCategory() {
        return accountCategory;
    }

    public void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory;
    }

    @Override
    public String toString() {
        return "suggestionsAccount{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", accountCategory='" + accountCategory + '\'' +
                '}';
    }
}
