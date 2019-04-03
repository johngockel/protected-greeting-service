package de.johngockel.service.core.model;

public class Greeting {

    private String id;
    private String content;

    public Greeting(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
