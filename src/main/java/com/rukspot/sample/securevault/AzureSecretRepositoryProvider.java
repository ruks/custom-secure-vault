package com.rukspot.sample.securevault;

import org.wso2.securevault.keystore.IdentityKeyStoreWrapper;
import org.wso2.securevault.keystore.TrustKeyStoreWrapper;
import org.wso2.securevault.secret.SecretRepository;
import org.wso2.securevault.secret.SecretRepositoryProvider;

public class AzureSecretRepositoryProvider implements SecretRepositoryProvider {
    public SecretRepository getSecretRepository(IdentityKeyStoreWrapper identityKeyStoreWrapper, TrustKeyStoreWrapper trustKeyStoreWrapper) {
        return new AzureSecretRepositoryImpl();
    }
}
