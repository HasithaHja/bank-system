package org.example.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Account {
    private final StringProperty owner;
    private final StringProperty accountnumber;
    private final DoubleProperty balance;

    public Account(String owner, String accountNumber, double balance) {
        this.owner = new SimpleStringProperty(this, "Owner", owner);
        this.accountnumber = new SimpleStringProperty(this, "Account Number", accountNumber);
        this.balance = new SimpleDoubleProperty(this, "Balance", balance);
    }

    public StringProperty ownerProperty() {return owner;}
    public StringProperty accountNumberProperty() {return accountnumber;}
    public DoubleProperty balanceProperty() {return balance;}
}
