package me.dio.academiadigital.service;

import java.util.List;

import me.dio.academiadigital.entity.Aluno;
import me.dio.academiadigital.entity.AvaliacaoFisica;
import me.dio.academiadigital.entity.form.AlunoForm;
import me.dio.academiadigital.entity.form.AlunoUpdateForm;

public interface AlunoService {

	Aluno create(AlunoForm form);

	Aluno get(Long id);

	List<Aluno> getAll(String dataDeNascimento);

	Aluno update(Long id, AlunoUpdateForm formUpdate);

	void delete(Long id);
	
	List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);



}
