package eu.programisci.Test.towar.ob;

import javax.persistence.*;
import eu.programisci.Test.towar.ob.EJednostkaMiary;

import java.util.Date;

@Entity
@Table(name = "towary")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_towary_id")
public class TowarOB {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "pkwiu")
    private String pkwiu;

    @Column(name = "jednostkaMiary")
    @Enumerated(EnumType.STRING)
    private EJednostkaMiary jednostkaMiary; /*enum*/

    @Column(name = "vat")
    private Integer vat;

    @Column(name = "cenaNetto")
    private Double cenaNetto;

    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUtworzenia;

    public Long getId() {
        return id;
    }

    public void setId(Long aId) {
        id = aId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String aNazwa) { nazwa = aNazwa; }

    public String getPkwiu() {
        return pkwiu;
    }

    public void setPkwiu(String aPkwiu) {
        pkwiu = aPkwiu;
    }

    public EJednostkaMiary getJednostkaMiary() {
        return jednostkaMiary;
    }

    public void setJednostkaMiary(EJednostkaMiary aJednostkaMiary) {
        jednostkaMiary = aJednostkaMiary;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer aVat) {
        vat = aVat;
    }

    public Double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(Double aCenaNetto) {
        cenaNetto = aCenaNetto;
    }

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }

}
