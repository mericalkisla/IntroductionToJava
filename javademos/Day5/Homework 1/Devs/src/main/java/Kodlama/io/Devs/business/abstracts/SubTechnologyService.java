package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.SubTechnology;

public interface SubTechnologyService {
	List<SubTechnology> getAll();

	SubTechnology getById(int id);

	SubTechnology add(SubTechnology subTechnology);

	SubTechnology update(SubTechnology subTechnology);

	void delete(SubTechnology subTechnology);

	List<SubTechnology> getByProgrammingLanguageId(int programmingLanguageId);
}
