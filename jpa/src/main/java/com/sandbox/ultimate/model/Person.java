package com.sandbox.ultimate.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue
    @Column(name = "PERSON_ID")
    private Long key;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private int age;

    @OneToMany(mappedBy = "key")
    private List<Person> children;

    @ManyToOne(fetch = FetchType.EAGER)
    private Person parent;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private IdCard idCard;

    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    private List<Phone> phoneList = new ArrayList<>();

    public Person() {
        //JPA c'tor
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getParent() {
        return parent;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void addPhone(Phone phone) {
        this.phoneList.add(phone);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("key=").append(key);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", idCard=").append(idCard);
        sb.append(", phoneList=").append(phoneList);
        sb.append(", parent=").append(parent!=null?parent.name:"");
        sb.append(", children=").append(children!=null?children.size():0);
        sb.append('}');
        return sb.toString();
    }
}
