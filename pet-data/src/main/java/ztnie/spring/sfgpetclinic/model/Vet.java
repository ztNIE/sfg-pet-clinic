package ztnie.spring.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet  extends Person{
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets = new HashSet<>();

}
