package com.jcb.sampler;

import org.apache.jmeter.testbeans.BeanInfoSupport;
import org.apache.jmeter.testbeans.gui.FileEditor;

import java.beans.PropertyDescriptor;

public class SFTPSamplerBeanInfo extends BeanInfoSupport {

    public SFTPSamplerBeanInfo() {

        super(SFTPSampler.class);

        createPropertyGroup("Server", // $NON-NLS-1$
                new String[]{
                        "hostname", // $NON-NLS-1$
                        "port", // $NON-NLS-1$
                        "connectionTimeout"
                });

        createPropertyGroup("Login", // $NON-NLS-1$
                new String[]{
                        "username", // $NON-NLS-1$
                        "password" // $NON-NLS-1$
                });

        createPropertyGroup("Passphrase",
                new String[]{
//                        "sshkeyfile", // $NON-NLS-1$
                        "passphrase" // $NON-NLS-1$
                });

        createPropertyGroup("File Transfer", new String[]{
                "action", // $NON-NLS-1$
                "source", // $NON-NLS-1$
                "printFile",// $NON-NLS-1$
                "destination" // $NON-NLS-1$

        });

        PropertyDescriptor p;
        p = property("username"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");

        p = property("password"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");

        p = property("sshkeyfile");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");
        p.setPropertyEditorClass(FileEditor.class);

        p = property("passphrase");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");

        p = property("hostname"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");

        p = property("port"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, new Integer(22));

        p = property("connectionTimeout");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, new Integer(5000));

        p = property("action"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(NOT_OTHER, Boolean.TRUE);
        p.setValue(DEFAULT, "get");
        p.setValue(TAGS, new String[]{
                SFTPSampler.SFTP_COMMAND_GET,
                SFTPSampler.SFTP_COMMAND_PUT,
                SFTPSampler.SFTP_COMMAND_RM,
                SFTPSampler.SFTP_COMMAND_RMDIR,
                SFTPSampler.SFTP_COMMAND_LS
        });

        p = property("source"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");

        p = property("printFile"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, Boolean.TRUE);

        p = property("destination"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");

    }
}