package eu.programisci.Test.contractor.ob;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test_users")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_test_users_id")
public class ContractorOB {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "login")
    private String login;

    @Column(name = "NIP")
    private String NIP;

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

    public String getLastname() {
        return address;
    }

    public void setLastname(String aAddress) {
        address = aAddress;
    }

    public String getLogin() {
        return NIP;
    }

    public void setLogin(String aNIP) {
        NIP = aNIP;
    }

}
