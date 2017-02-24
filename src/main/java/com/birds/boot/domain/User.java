package com.birds.boot.domain;

import java.util.Date;

import com.birds.boot.service.JsonConverters;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class User {

    private Long   id;
    private String nickName;
    @JsonSerialize(using = JsonConverters.DateSerializer.class)
    @JsonDeserialize(using = JsonConverters.DateDeserializer.class)
    private Date   birthDay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

}
