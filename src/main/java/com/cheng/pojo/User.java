package com.cheng.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_user")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue
    private int uid;
    private String username;
    private String password;
}
