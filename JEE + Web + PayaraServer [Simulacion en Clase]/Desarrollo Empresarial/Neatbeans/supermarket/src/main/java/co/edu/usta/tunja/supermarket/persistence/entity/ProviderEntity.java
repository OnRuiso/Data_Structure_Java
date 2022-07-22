package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="PROVIDER")
public class ProviderEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para postgress es IDENTITY , con mySQL es AUTO
    @Column(name="id_provider",nullable = false)
    private Integer idProvider;

    @Column(name="name",length = 45, nullable = false)
    private String nameProvider;

    @Column(name="address",length = 45, nullable = false)
    private String address;

    @Column(name = "phone_number",length = 45,nullable = false)
    private String phoneNumber;

    @Column(name="url",length = 45,nullable = false)
    private String url;

    @Column(name = "nit",length = 45,nullable = false)
    private String nit;

    @OneToMany(mappedBy = "fkIdProvider")
    private List<ProductProviderEntity> myProductProvider;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdProvider() {        return idProvider;    }
    public void setIdProvider(Integer idProvider) {        this.idProvider = idProvider;    }

    public String getNameProvider() {        return nameProvider;    }
    public void setNameProvider(String nameProvider) {        this.nameProvider = nameProvider;    }

    public String getAddress() {        return address;    }
    public void setAddress(String address) {        this.address = address;    }

    public String getPhoneNumber() {        return phoneNumber;    }
    public void setPhoneNumber(String phoneNumber) {        this.phoneNumber = phoneNumber;    }

    public String getUrl() {        return url;    }
    public void setUrl(String url) {        this.url = url;    }

    public String getNit() {        return nit;    }
    public void setNit(String nit) {        this.nit = nit;    }

    public List<ProductProviderEntity> getMyProductProvider() {        return myProductProvider;    }
    public void setMyProductProvider(List<ProductProviderEntity> myProductProvider) {        this.myProductProvider = myProductProvider;    }
    
    /*------------------------------------------ TO STRING ------------------------------------------*/

    @Override
    public String toString() {
        return "nameProvider= " + nameProvider + " phoneNumber= " + phoneNumber + " nit= " + nit + '\n';
    }
    
    /*------------------------------------------ EQUALS and HASH CODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idProvider);
        hash = 23 * hash + Objects.hashCode(this.nameProvider);
        hash = 23 * hash + Objects.hashCode(this.address);
        hash = 23 * hash + Objects.hashCode(this.phoneNumber);
        hash = 23 * hash + Objects.hashCode(this.url);
        hash = 23 * hash + Objects.hashCode(this.nit);
        hash = 23 * hash + Objects.hashCode(this.myProductProvider);
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
        final ProviderEntity other = (ProviderEntity) obj;
        if (!Objects.equals(this.nameProvider, other.nameProvider)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.nit, other.nit)) {
            return false;
        }
        if (!Objects.equals(this.idProvider, other.idProvider)) {
            return false;
        }
        if (!Objects.equals(this.myProductProvider, other.myProductProvider)) {
            return false;
        }
        return true;
    }
    
    
}

