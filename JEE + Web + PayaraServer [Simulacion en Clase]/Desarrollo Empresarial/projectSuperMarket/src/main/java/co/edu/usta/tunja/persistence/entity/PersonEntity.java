package co.edu.usta.tunja.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PERSON")
public class PersonEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person",nullable = false)
    private Integer idPerson;

    @Column(name = "person_name",length = 45,nullable = false)
    private String personName;

    @Column(name = "person_address",length = 45,nullable = false)
    private String personAddress;

    @Column(name = "person_phone",length = 45,nullable = false)
    private String personPhone;

    @Column(name = "person_dni",length = 10,nullable = false)
    private String personDni;

    @Column(name = "person_last_name",length = 45,nullable = false)
    private String personLastName;

    @OneToMany(mappedBy = "fkIdPersonAdministrator")
    private List<TicketDetailEntity> myTicketDetailToPerson;

    @OneToMany(mappedBy = "fkIdPersonCashier")
    private List<TicketEntity> myTicketCashier;

    @OneToMany(mappedBy = "fkIdPersonCustomer")
    private List<TicketEntity> myTicketCustomer;

    @OneToMany(mappedBy = "fkIdPerson")
    private List<PersonEntity> myPerson;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdPerson() {        return idPerson;    }
    public void setIdPerson(Integer idPerson) {        this.idPerson = idPerson;    }

    public String getPersonName() {        return personName;    }
    public void setPersonName(String personName) {        this.personName = personName;    }

    public String getPersonAddress() {        return personAddress;    }
    public void setPersonAddress(String personAddress) {        this.personAddress = personAddress;    }

    public String getPersonPhone() {        return personPhone;    }
    public void setPersonPhone(String personPhone) {        this.personPhone = personPhone;    }

    public String getPersonDni() {        return personDni;    }
    public void setPersonDni(String personDni) {        this.personDni = personDni;    }

    public String getPersonLastName() {        return personLastName;    }
    public void setPersonLastName(String personLastName) {        this.personLastName = personLastName;    }

    public List<TicketDetailEntity> getMyTicketDetailToPerson() {        return myTicketDetailToPerson;    }
    public void setMyTicketDetailToPerson(List<TicketDetailEntity> myTicketDetailToPerson) {        this.myTicketDetailToPerson = myTicketDetailToPerson;    }

    public List<TicketEntity> getMyTicketCashier() {        return myTicketCashier;    }
    public void setMyTicketCashier(List<TicketEntity> myTicketCashier) {        this.myTicketCashier = myTicketCashier;    }

    public List<TicketEntity> getMyTicketCustomer() {        return myTicketCustomer;    }
    public void setMyTicketCustomer(List<TicketEntity> myTicketCustomer) {        this.myTicketCustomer = myTicketCustomer;    }

    public List<PersonEntity> getMyPerson() {        return myPerson;    }
    public void setMyPerson(List<PersonEntity> myPerson) {        this.myPerson = myPerson;    }
}
