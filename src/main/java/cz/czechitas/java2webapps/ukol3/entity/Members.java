package cz.czechitas.java2webapps.ukol3.entity;

public class Members {
    private String name;
    private String surname;
    private String company;
    private String street;
    private String postCodeTown;
    private String fullAdress;
    private String email;
    private String telNumber;
    private String web;
    private String status;


    public Members() {
//       this(null,null,null,null
//               ,null,null,null,null);
    }

    public Members(String name, String surname, String company, String street, String postCodeTown,
                   String email, String telNumber, String web, String status) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.street = street;
        this.postCodeTown = postCodeTown;
        this.email = email;
        this.telNumber = telNumber;
        this.web = web;
        this.status = status;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCodeTown() {
        return postCodeTown;
    }

    public void setPostCodeTown(String postCodeTown) {
        this.postCodeTown = postCodeTown;
    }

    public String getFullAdress() {
        if (street == null || postCodeTown == null) {
            return null;
        } else {
            return street + ", " + postCodeTown;
        }
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
