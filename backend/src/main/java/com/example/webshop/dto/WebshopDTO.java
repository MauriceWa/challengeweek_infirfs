package com.example.webshop.dto;

public class WebshopDTO {
    private long id;
    private String name;
    private String url;
    private String prefix;

    public WebshopDTO(String name, String url, String prefix) {
        this.name = name;
        this.url = url;
        this.prefix = prefix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
