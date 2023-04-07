package com.rukspot.sample.securevault;

import org.wso2.securevault.secret.SecretRepository;

import java.util.Properties;

public class AzureSecretRepositoryImpl implements SecretRepository {
    public void init(Properties properties, String s) {
    }

    public String getSecret(String s) {
        return "Val from AZ";
    }

    public String getEncryptedData(String s) {
        return null;
    }

    public void setParent(SecretRepository secretRepository) {
    }

    public SecretRepository getParent() {
        return null;
    }
}
