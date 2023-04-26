package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import Kodlama.io.Devs.entities.concretes.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService {

    private SubTechnologyRepository subTechnologyRepository;

    @Autowired
    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
        this.subTechnologyRepository = subTechnologyRepository;
    }

    @Override
    public List<SubTechnology> getAll() {
        return subTechnologyRepository.getAll();
    }

    @Override
    public SubTechnology getById(int id) {
        return subTechnologyRepository.getById(id);
    }

    @Override
    public SubTechnology add(SubTechnology subTechnology) {
        return subTechnologyRepository.add(subTechnology);
    }

    @Override
    public SubTechnology update(SubTechnology subTechnology) {
        return subTechnologyRepository.update(subTechnology);
    }

    @Override
    public void delete(SubTechnology subTechnology) {
        subTechnologyRepository.delete(subTechnology);
    }

	@Override
	public List<SubTechnology> getByProgrammingLanguageId(int programmingLanguageId) {
		// TODO Auto-generated method stub
		return null;
	}
}
