package me.dio.academiadigital.service;

import java.util.List;

import me.dio.academiadigital.entity.Matricula;
import me.dio.academiadigital.entity.form.MatriculaForm;

public interface MatriculaService {

	Matricula create(MatriculaForm form);

	Matricula get(Long id);

	List<Matricula> getAll(String bairro);

	void delete(Long id);
}
