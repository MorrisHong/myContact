package me.grace.mycontact.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@ToString
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;
}
