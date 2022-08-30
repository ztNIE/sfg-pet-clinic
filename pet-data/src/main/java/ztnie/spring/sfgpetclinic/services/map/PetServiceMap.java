package ztnie.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import ztnie.spring.sfgpetclinic.model.Pet;
import ztnie.spring.sfgpetclinic.services.CrudService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }
}
