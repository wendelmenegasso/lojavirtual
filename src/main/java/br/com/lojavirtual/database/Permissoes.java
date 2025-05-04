package br.com.lojavirtual.database;

import jakarta.persistence.*;

@Entity
@Table
public class Permissoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Role role;
    private  Subrole subrole;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Subrole getSubrole() {
        return subrole;
    }

    public void setSubrole(Subrole subrole) {
        this.subrole = subrole;
    }
}
