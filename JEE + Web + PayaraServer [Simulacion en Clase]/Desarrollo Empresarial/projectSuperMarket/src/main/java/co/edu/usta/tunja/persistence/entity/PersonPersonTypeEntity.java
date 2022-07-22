package co.edu.usta.tunja.persistence.entity;

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
    @JoinColumn(name="fk_id_person_type",insertable = false,updatable = false)
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
}
