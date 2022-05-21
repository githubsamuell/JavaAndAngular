package com.my.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.my.server.enums.Status;

@Entity

public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAdress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public Server(Long id, String ipAdress, String name, String memory, String type, String imgUrl, Status status) {
        this.id = id;
        this.ipAdress = ipAdress;
        this.name = name;
        this.memory = memory;
        this.type = type;
        this.imageUrl = imgUrl;
        this.status = status;
    }

    public Server() {
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(final String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(final String memory) {
        this.memory = memory;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(final String imgUrl) {
        this.imageUrl = imgUrl;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(final Status status) {
        this.status = status;
    }

    private Status status;

}
