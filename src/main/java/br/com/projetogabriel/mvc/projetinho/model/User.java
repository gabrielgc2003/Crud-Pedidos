package br.com.projetogabriel.mvc.projetinho.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
      @Id
      private String username;
      private String password;
      private boolean enable;

      @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
      private List<Pedido> pedidos;

      public String getUsername() {
            return username;
      }
      public void setUsername(String username) {
            this.username = username;
      }
      public String getPassword() {
            return password;
      }
      public void setPassword(String password) {
            this.password = password;
      }
      public boolean isEnable() {
            return enable;
      }
      public void setEnable(boolean enable) {
            this.enable = enable;
      }
}
