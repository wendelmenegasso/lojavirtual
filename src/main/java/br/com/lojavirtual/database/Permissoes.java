package br.com.lojavirtual.database;

import jakarta.persistence.*;

@Entity
@Table
public class Permissoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_Permissoes", referencedColumnName = "id")
    private Role role;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subrole_Permissoes", referencedColumnName = "id")
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
