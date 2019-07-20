package com.tw.apistackbase.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile_name")
public class Profile {
    @Id
    @Column(name="registered_capital")
    private  Long registeredCapital;
    @Column(name="cert_id")
    private String certId;

    public Profile() {
    }

    public void setRegisteredCapital(Long registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public Long getRegisteredCapital() {
        return registeredCapital;
    }

    public String getCertId() {
        return certId;
    }
}
