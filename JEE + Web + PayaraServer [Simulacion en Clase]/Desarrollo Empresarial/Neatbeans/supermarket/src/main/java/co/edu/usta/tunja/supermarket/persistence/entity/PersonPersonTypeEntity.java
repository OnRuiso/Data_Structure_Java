package co.edu.usta.tunja.supermarket.persistence.entity;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name="PERSON_PERSON_TYPE")
public class PersonPersonTypeEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_person_person_type",nullable = false)
    private Integer idPersonPersonType;

    @ManyToOne
    @JoinColumn(name="ffk_id_person_type",insertable = false,updatable = false)
    private PersonTypeEntity fkIdPersonType;

    @ManyToOne
    @JoinColumn(name="fk_id_person",insertable = false,updatable = false)
    private PersonEntity fkIdPerson;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdPersonPersonType() {        return idPersonPersonType;    }
    public void setIdPersonPersonType(Integer idPersonPersonType) {        this.idPersonPersonType = idPersonPersonType;    }

    public PersonTypeEntity getFkIdPersonType() {        return fkIdPersonType;    }
    public void setFkIdPersonType(PersonTypeEntity fkIdPersonType) {        this.fkIdPersonType = fkIdPersonType;    }

    public PersonEntity getFkIdPerson() {        return fkIdPerson;    }
    public void setFkIdPerson(PersonEntity fkIdPerson) {        this.fkIdPerson = fkIdPerson;    }
    
    /*------------------------------------------ TO STRING ------------------------------------------*/
    
    @Override
    public String toString() {
        return "idPersonPersonType = " + idPersonPersonType 
                + " fkIdPersonType = " + fkIdPersonType 
                + " fkIdPerson = " + fkIdPerson +'\n';
    }
    
    /*------------------------------------------ EQUALS and HASH CODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.idPersonPersonType);
        hash = 67 * hash + Objects.hashCode(this.fkIdPersonType);
        hash = 67 * hash + Objects.hashCode(this.fkIdPerson);
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
        final PersonPersonTypeEntity other = (PersonPersonTypeEntity) obj;
        if (!Objects.equals(this.idPersonPersonType, other.idPersonPersonType)) {
            return false;
        }
        if (!Objects.equals(this.fkIdPersonType, other.fkIdPersonType)) {
            return false;
        }
        if (!Objects.equals(this.fkIdPerson, other.fkIdPerson)) {
            return false;
        }
        return true;
    }

    
}
