package me.dio.academiadigital.service;

import java.util.List;

import me.dio.academiadigital.entity.AvaliacaoFisica;
import me.dio.academiadigital.entity.form.AvaliacaoFisicaForm;
import me.dio.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;

public interface AvaliacaoFisicaService {

	AvaliacaoFisica create(AvaliacaoFisicaForm form);

	AvaliacaoFisica get(Long id);

	List<AvaliacaoFisica> getAll();

	AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

	void delete(Long id);
}
