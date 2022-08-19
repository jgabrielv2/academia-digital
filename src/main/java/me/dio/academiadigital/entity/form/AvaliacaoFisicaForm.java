package me.dio.academiadigital.entity.form;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

	  @Positive(message = "O Id do aluno precisa ser positivo.")
	  private Long alunoId;

	  @NotNull(message = "Preencha o campo corretamente.")
	  @Positive(message = "${validatedValue}' precisa ser positivo.")
	  private Double peso;

	  @NotNull(message = "Preencha o campo corretamente.")
	  @Positive(message = "${validatedValue}' precisa ser positivo.")
	  @DecimalMin(value = "1", message = "'${validatedValue}' precisa ser no mínimo {value}.")
	  private Double altura;
	
}
