package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.SubTechnology;

public interface SubTechnologyRepository {
	List<SubTechnology> getAll();

	SubTechnology getById(int id);

	SubTechnology add(SubTechnology subTechnology);

	SubTechnology update(SubTechnology subTechnology);

	void delete(SubTechnology subTechnology);
}
