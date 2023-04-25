package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	ProgrammingLanguage add(ProgrammingLanguage language);
	ProgrammingLanguage update(ProgrammingLanguage language);
	void delete(ProgrammingLanguage language);
}
