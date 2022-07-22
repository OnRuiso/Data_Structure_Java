package co.edu.usta.tunja.persistence.entity;

import javax.persistence.*;
import java.util.List;

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
}
