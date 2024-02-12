package demo;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "student_Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "address_id")
    private int AddressId;

    @Column(name = "STREET", length = 50)
    private String street;
    @Column(name = "CITY", length = 100)
    private String city;

    @Column(name = "is_open")
    private boolean isOpen;

    private Double x;

    @Column(name = "Added_date")
    @Temporal(TemporalType.DATE)
    private Date AddedDate;

    @Lob
    private byte[] image;

    public Address(int addressId, String street, String city, boolean isOpen, Double x, Date addedDate, byte[] image) {
        AddressId = addressId;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        AddedDate = addedDate;
        this.image = image;
    }

    public Address() {
    }

    public int getAddressId() {
        return AddressId;
    }

    public void setAddressId(int addressId) {
        AddressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return AddedDate;
    }

    public void setAddedDate(Date addedDate) {
        AddedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address [AddressId=" + AddressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
                + ", x="
                + x + ", AddedDate=" + AddedDate + ", image=" + Arrays.toString(image) + "]";
    }

}
