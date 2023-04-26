package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;

	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "C#"));
		languages.add(new ProgrammingLanguage(2, "Java"));
		languages.add(new ProgrammingLanguage(3, "Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return languages.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
	}

	@Override
	public ProgrammingLanguage add(ProgrammingLanguage language) {
		if (language.getName() == null || language.getName().trim().isEmpty()) {
			throw new IllegalArgumentException("Programlama dili boş geçilemez.");
		}
		if (languages.stream().anyMatch(l -> l.getName().equalsIgnoreCase(language.getName()))) {
			throw new IllegalArgumentException("Bu programlama dili zaten mevcut.");
		}

		languages.add(language);
		return language;
	}

	@Override
	public ProgrammingLanguage update(ProgrammingLanguage language) {
		ProgrammingLanguage existingLanguage = getById(language.getId());

		if (existingLanguage == null) {
			throw new IllegalArgumentException("Güncellenmek istenen programlama dili bulunamadı.");
		}

		if (language.getName() == null || language.getName().trim().isEmpty()) {
			throw new IllegalArgumentException("Programlama dili boş geçilemez.");
		}

		existingLanguage.setName(language.getName());
		return existingLanguage;
	}

	@Override
	public void delete(ProgrammingLanguage language) {
		ProgrammingLanguage existingLanguage = getById(language.getId());

		if (existingLanguage == null) {
			throw new IllegalArgumentException("Silmek istenen programlama dili bulunamadı.");
		}

		languages.remove(existingLanguage);
	}

}
