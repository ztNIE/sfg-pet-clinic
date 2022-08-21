package ztnie.spring.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    private PetType petType;
    private String name;
    private Owner owner;
    private LocalDate birthDate;
}
