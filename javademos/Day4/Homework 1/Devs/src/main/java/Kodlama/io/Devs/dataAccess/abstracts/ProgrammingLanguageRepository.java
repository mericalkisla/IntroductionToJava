package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	ProgrammingLanguage add(ProgrammingLanguage language);
	ProgrammingLanguage update(ProgrammingLanguage language);
	void delete(ProgrammingLanguage language);
}
