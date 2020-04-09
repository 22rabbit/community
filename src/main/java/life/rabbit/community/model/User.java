package life.rabbit.community.model;

import java.text.DateFormat;

public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }
    /***
    private Double Temperature;
    private Double Humidity;
    private Double Electric_Field_Intensity ;
    private Double Magnetic_Field_Intensity ;
    private DateFormat Datetime;

    public Double getTemperature() {
        return Temperature;
    }

    public void setTemperature(Double temperature) {
        Temperature = temperature;
    }

    public Double getHumidity() {
        return Humidity;
    }

    public void setHumidity(Double humidity) {
        Humidity = humidity;
    }

    public Double getElectric_Field_Intensity() {
        return Electric_Field_Intensity;
    }

    public void setElectric_Field_Intensity(Double electric_Field_Intensity) {
        Electric_Field_Intensity = electric_Field_Intensity;
    }

    public Double getMagnetic_Field_Intensity() {
        return Magnetic_Field_Intensity;
    }

    public void setMagnetic_Field_Intensity(Double magnetic_Field_Intensity) {
        Magnetic_Field_Intensity = magnetic_Field_Intensity;
    }

    public DateFormat getDatetime() {
        return Datetime;
    }

    public void setDatetime(DateFormat datetime) {
        Datetime = datetime;
    }
     ***/
}

