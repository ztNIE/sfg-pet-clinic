package ztnie.spring.sfgpetclinic.services;

import ztnie.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
