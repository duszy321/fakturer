package eu.programisci.Test.contractor.dto;

import java.util.Date;

public class ContractorDTO {

    private Long id;
    private String name;
    private String address;
    private String NIP;

    public ContractorDTO() {
    }

    public ContractorDTO(String aName, String aAddress, String aNIP) {
        name = aName;
        address = aAddress;
        NIP = aNIP;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long aId) {
        id = aId;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String aAddress) {
        address = aAddress;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String aNIP) {
        NIP = aNIP;
    }

}
