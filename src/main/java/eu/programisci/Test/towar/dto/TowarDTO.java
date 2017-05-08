package eu.programisci.Test.towar.dto;

import eu.programisci.Test.towar.ob.EJednostkaMiary;

public class TowarDTO {

    private Long id;
    private String nazwa;
    private String pkwiu;
    private EJednostkaMiary jednostkaMiary; /*enum*/
    private Integer vat;
    private Double cenaNetto;

    public TowarDTO() {
    }

    public TowarDTO(String aNazwa, String aPkwiu, EJednostkaMiary jednostka, Integer aVat, Double aCenaNetto) {
        nazwa = aNazwa;
        pkwiu = aPkwiu;
        jednostkaMiary = jednostka;
        vat = aVat;
        cenaNetto = aCenaNetto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long aId) {
        id = aId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String aNazwa) {
        nazwa = aNazwa;
    }

    public String getPkwiu() {
        return pkwiu;
    }

    public void setPkwiu(String aPkwiu) {
        pkwiu = aPkwiu;
    }

    public EJednostkaMiary getJednostkaMiary() {
        return jednostkaMiary;
    }

    public void setJednostkaMiary(EJednostkaMiary jednostkaMiary) {
        this.jednostkaMiary = jednostkaMiary;
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

}
