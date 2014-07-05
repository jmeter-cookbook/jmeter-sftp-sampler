package com.jcb.sampler;

import com.jcraft.jsch.UserInfo;

import java.io.Serializable;

public class SFTPUserInfo implements UserInfo, Serializable {

    private SFTPSampler owner;

    public SFTPUserInfo(SFTPSampler owner) {
        this.owner = owner;
    }

    public String getPassphrase() {
        return owner.getPassphrase();
    }

    public String getPassword() {
        return owner.getPassword();
    }

    public boolean promptPassword(String message) {
        return true;
    }

    public boolean promptPassphrase(String message) {
        return true;
    }

    public boolean promptYesNo(String message) {
        return true;
    }

    public void showMessage(String message) {
        return;
    }

}
