package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="PERSON_TYPE")
public class PersonTypeEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_person_type",nullable = false)
    private Integer idPersonType;

    @Column(name="person_type_name",length = 45,nullable = false)
    private String personTypeName;

    @OneToMany(mappedBy = "fkIdPersonType")
    private List<PersonPersonTypeEntity> myPersonType;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdPersonType() {        return idPersonType;    }
    public void setIdPersonType(Integer idPersonType) {        this.idPersonType = idPersonType;    }

    public String getPersonTypeName() {        return personTypeName;    }
    public void setPersonTypeName(String personTypeName) {        this.personTypeName = personTypeName;    }

    public List<PersonPersonTypeEntity> getMyPersonType() {        return myPersonType;    }
    public void setMyPersonType(List<PersonPersonTypeEntity> myPersonType) {        this.myPersonType = myPersonType;    }
    
    /*------------------------------------------ TO STRING ------------------------------------------*/

    @Override
    public String toString() {
        return "personTypeName = " + personTypeName + '\n';
    }
    
    /*------------------------------------------ EQUALS and HASH CODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idPersonType);
        hash = 29 * hash + Objects.hashCode(this.personTypeName);
        hash = 29 * hash + Objects.hashCode(this.myPersonType);
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
        final PersonTypeEntity other = (PersonTypeEntity) obj;
        if (!Objects.equals(this.personTypeName, other.personTypeName)) {
            return false;
        }
        if (!Objects.equals(this.idPersonType, other.idPersonType)) {
            return false;
        }
        if (!Objects.equals(this.myPersonType, other.myPersonType)) {
            return false;
        }
        return true;
    }
    
    
}
