package org.online.bank.common;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonResponse<T> {

    public static final Logger logger = LoggerFactory.getLogger(CommonResponse.class);

    private String responseCode = "200";
    private String responseMessage = "SUCCESS";
    private Boolean validRequest = true;
    private Boolean exeNoErrorComplete = true;
    private T responseObject;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Boolean getValidRequest() {
        return validRequest;
    }

    public void setValidRequest(Boolean validRequest) {
        this.validRequest = validRequest;
    }

    public Boolean getExeNoErrorComplete() {
        return exeNoErrorComplete;
    }

    public void setExeNoErrorComplete(Boolean exeNoErrorComplete) {
        this.exeNoErrorComplete = exeNoErrorComplete;
    }

    public T getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(T responseObject) {
        this.responseObject = responseObject;
    }
}
