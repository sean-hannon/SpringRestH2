package com.aws.codestar.projecttemplates.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class URL {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String longURL;
    private String shortURL;

    public URL() {
    }

    public  URL (String longURL){
        this.longURL = longURL;
    }

    @Override
    public String toString() {
        return "URL{" +
                "id=" + id +
                ", longURL='" + longURL + '\'' +
                ", shortURL='" + shortURL + '\'' +
                '}';
    }
}
