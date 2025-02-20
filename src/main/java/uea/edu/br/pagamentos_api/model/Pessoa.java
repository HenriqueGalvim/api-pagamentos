package uea.edu.br.pagamentos_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private Long codigo;
    private String nome;
    private Boolean ativo; // Teste
}
