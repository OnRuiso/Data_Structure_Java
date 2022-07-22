package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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

    
    @OneToMany(mappedBy = "fkIdPerson")
    private List<PersonPersonTypeEntity> myFKIdPerson;
    
    @OneToMany(mappedBy = "fkIdPersonCashier")
    private List<TicketEntity> myfkIdPersonCashier;
    
    @OneToMany(mappedBy = "fkIdPersonCustomer")
    private List<TicketEntity> myfkIdPersonCustomer;
    
    @OneToMany(mappedBy = "fkIdPersonAdministrator")
    private List<TicketDetailEntity> myfkIdPersonAdministrator;
    
    
    
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

    public List<PersonPersonTypeEntity> getMyFKIdPerson() {        return myFKIdPerson;    }
    public void setMyFKIdPerson(List<PersonPersonTypeEntity> myFKIdPerson) {       this.myFKIdPerson = myFKIdPerson;    }
    
    public List<TicketEntity> getMyfkIdPersonCashier() {        return myfkIdPersonCashier;    }
    public void setMyfkIdPersonCashier(List<TicketEntity> myfkIdPersonCashier) {        this.myfkIdPersonCashier = myfkIdPersonCashier;    }
    
    public List<TicketEntity> getMyfkIdPersonCustomer() {        return myfkIdPersonCustomer;    }
    public void setMyfkIdPersonCustomer(List<TicketEntity> myfkIdPersonCustomer) {        this.myfkIdPersonCustomer = myfkIdPersonCustomer;    }
    
    public List<TicketDetailEntity> getMyfkIdPersonAdministrator() {        return myfkIdPersonAdministrator;    }
    public void setMyfkIdPersonAdministrator(List<TicketDetailEntity> myfkIdPersonAdministrator) {        this.myfkIdPersonAdministrator = myfkIdPersonAdministrator;    }

    /*------------------------------------------ TO STRING ------------------------------------------*/

    @Override
    public String toString() {
        return "Nombre de La persona= " + personName + " Dni= " + personDni + '\n' ;
    }
    
    /*------------------------------------------ EQUALS and HASHCODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.idPerson);
        hash = 31 * hash + Objects.hashCode(this.personName);
        hash = 31 * hash + Objects.hashCode(this.personAddress);
        hash = 31 * hash + Objects.hashCode(this.personPhone);
        hash = 31 * hash + Objects.hashCode(this.personDni);
        hash = 31 * hash + Objects.hashCode(this.personLastName);
        hash = 31 * hash + Objects.hashCode(this.myFKIdPerson);
        hash = 31 * hash + Objects.hashCode(this.myfkIdPersonCashier);
        hash = 31 * hash + Objects.hashCode(this.myfkIdPersonCustomer);
        hash = 31 * hash + Objects.hashCode(this.myfkIdPersonAdministrator);
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
        final PersonEntity other = (PersonEntity) obj;
        if (!Objects.equals(this.personName, other.personName)) {
            return false;
        }
        if (!Objects.equals(this.personAddress, other.personAddress)) {
            return false;
        }
        if (!Objects.equals(this.personPhone, other.personPhone)) {
            return false;
        }
        if (!Objects.equals(this.personDni, other.personDni)) {
            return false;
        }
        if (!Objects.equals(this.personLastName, other.personLastName)) {
            return false;
        }
        if (!Objects.equals(this.idPerson, other.idPerson)) {
            return false;
        }
        if (!Objects.equals(this.myFKIdPerson, other.myFKIdPerson)) {
            return false;
        }
        if (!Objects.equals(this.myfkIdPersonCashier, other.myfkIdPersonCashier)) {
            return false;
        }
        if (!Objects.equals(this.myfkIdPersonCustomer, other.myfkIdPersonCustomer)) {
            return false;
        }
        if (!Objects.equals(this.myfkIdPersonAdministrator, other.myfkIdPersonAdministrator)) {
            return false;
        }
        return true;
    }

    
    
    
}
