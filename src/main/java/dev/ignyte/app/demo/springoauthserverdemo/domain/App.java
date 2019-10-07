package dev.ignyte.app.demo.springoauthserverdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "app")
public class App {
    @Id
    @Column(name = "app_id")
    private String appId;
    private String username;
    private String password;
    private boolean enabled;

    @Column(name = "app_name")
    private String appName;
}
