package com.rukspot.sample.securevault;

import org.wso2.securevault.secret.AbstractSecretCallbackHandler;
import org.wso2.securevault.secret.SingleSecretCallback;

public class ChoreoSecretCallbackHandler extends AbstractSecretCallbackHandler {
    protected void handleSingleSecretCallback(SingleSecretCallback singleSecretCallback) {
        if("identity.key.password".equalsIgnoreCase(singleSecretCallback.getId())) {
            singleSecretCallback.setSecret("wso2carbon");
        } else if("identity.store.password".equalsIgnoreCase(singleSecretCallback.getId())) {
            singleSecretCallback.setSecret("wso2carbon");
        } else {
            singleSecretCallback.setSecret("password");
        }
    }
}
