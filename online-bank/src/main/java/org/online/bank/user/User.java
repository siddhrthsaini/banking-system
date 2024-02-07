package org.online.bank.user;


import org.online.bank.common.BankObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User extends BankObject {
    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    String createdBy;
    String createdOn;
    String modifiedBy;
    String modifiedOn;
    String name;
    String userName;
    String password;

    String mobileNumber;

    String emailId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUseName() {
        return userName;
    }

    public void setUseName(String useName) {
        this.userName = useName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public User(String createdBy, String createdOn, String modifiedBy, String modifiedOn, String name, String userName, String password, String mobileNumber, String emailId) {
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    public User() {
        super();
    }
    @Override
    public String toString() {
        return "User{" +
                "createdBy='" + createdBy + '\'' +
                ", createdOn='" + createdOn + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedOn='" + modifiedOn + '\'' +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
