package uea.edu.br.pagamentos_api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uea.edu.br.pagamentos_api.model.TipoLancamento;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumoLancamentoDTO {
    private Long codigo;
    private String descricao;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private BigDecimal valor;
    private TipoLancamento tipo;
    private String categoria;
    private String pessoa;
}