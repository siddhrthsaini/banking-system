package org.online.bank.common;

import java.util.UUID;

public class BankObject {

    protected String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
