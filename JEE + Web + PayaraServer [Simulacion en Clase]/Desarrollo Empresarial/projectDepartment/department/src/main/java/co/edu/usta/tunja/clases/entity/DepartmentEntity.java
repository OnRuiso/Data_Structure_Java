/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.clases.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author ruiso
 */
@Entity
@Table(name="departments")
public class DepartmentEntity implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional=false)
    @Column(name="id_department")
    private Integer idDepartment;
    
    @Size(max=50)
    @Column(name="\"name\"")
    // escape = \"palabraReservada\"
    private String name;
    
    public DepartmentEntity(){
        
    }
    
    //...................................................... Getters and Setters

    public Integer getIdDepartment() {        return idDepartment;    }
    public void setIdDepartment(Integer idDepartment) {        this.idDepartment = idDepartment;    }

    public String getName() {        return name;    }
    public void setName(String name) {        this.name = name;    }
    
    // -- ...................................................Equals and HashCode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idDepartment);
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DepartmentEntity other = (DepartmentEntity) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.idDepartment, other.idDepartment)) {
            return false;
        }
        return true;
    }
    
    // -- .............................................................To string

    @Override
    public String toString() {
        return "DepartmentEntity{" + "idDepartment=" + idDepartment + ", name=" + name + '}';
    }
    
    
    
    
}
