package ztnie.spring.sfgpetclinic.services;

import ztnie.spring.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
