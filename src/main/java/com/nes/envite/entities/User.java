package com.nes.envite.entities;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private long id;
    private String userName;
    private String password;
    private String email;
    private long score;
    private Date created_at;
    private Date updated_at;

}
