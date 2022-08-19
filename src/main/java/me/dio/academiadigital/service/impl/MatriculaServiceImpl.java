package me.dio.academiadigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academiadigital.entity.Aluno;
import me.dio.academiadigital.entity.Matricula;
import me.dio.academiadigital.entity.form.MatriculaForm;
import me.dio.academiadigital.repository.AlunoRepository;
import me.dio.academiadigital.repository.MatriculaRepository;
import me.dio.academiadigital.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;

	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public Matricula create(MatriculaForm form) {
		Matricula matricula = new Matricula();
		Aluno aluno = alunoRepository.findById(form.getIdAluno()).get();
		matricula.setAluno(aluno);
		return matriculaRepository.save(matricula);
	}

	@Override
	public Matricula get(Long id) {
		return matriculaRepository.findById(id).get();
	}

	@Override
	public List<Matricula> getAll(String bairro) {
		if (bairro == null)
			return matriculaRepository.findAll();
		else
			return matriculaRepository.findByAlunoBairro(bairro);
	}

	@Override
	public void delete(Long id) {
		matriculaRepository.deleteById(id);

	}

}
