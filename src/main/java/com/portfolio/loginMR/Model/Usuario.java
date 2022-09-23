
package com.portfolio.loginMR.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="login_user")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String userId;
    private String password;
    
    public String getUserId()
    {
        return userId;
    }
    
    public Object getPassword()
    {
        return password;
    }
    
}
