package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import Kodlama.io.Devs.entities.concretes.SubTechnology;

@Repository
public class InMemorySubTechnologyRepository implements SubTechnologyRepository {

    private List<SubTechnology> subTechnologies;

    public InMemorySubTechnologyRepository() {
        this.subTechnologies = new ArrayList<>();
    }

    @Override
    public List<SubTechnology> getAll() {
        return subTechnologies;
    }

    @Override
    public SubTechnology getById(int id) {
        return subTechnologies.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public SubTechnology add(SubTechnology subTechnology) {
        subTechnologies.add(subTechnology);
        return subTechnology;
    }

    @Override
    public SubTechnology update(SubTechnology subTechnology) {
        SubTechnology existingSubTechnology = getById(subTechnology.getId());
        if (existingSubTechnology != null) {
            existingSubTechnology.setProgrammingLanguageId(subTechnology.getProgrammingLanguageId());
            existingSubTechnology.setName(subTechnology.getName());
        }
        return existingSubTechnology;
    }

    @Override
    public void delete(SubTechnology subTechnology) {
        subTechnologies.remove(subTechnology);
    }
}
