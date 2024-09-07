package com.jajangrohmatulloh.service.notification.model;

public class Data {
    private Long id;
    private String nama;
    private String login_datetime;
    private String agents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLogin_datetime() {
        return login_datetime;
    }

    public void setLogin_datetime(String login_datetime) {
        this.login_datetime = login_datetime;
    }

    public String getAgents() {
        return agents;
    }

    public void setAgents(String agents) {
        this.agents = agents;
    }
}
