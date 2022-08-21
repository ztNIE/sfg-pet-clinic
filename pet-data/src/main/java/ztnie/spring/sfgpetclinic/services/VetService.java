package ztnie.spring.sfgpetclinic.services;

import ztnie.spring.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByID(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
