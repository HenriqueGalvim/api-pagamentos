package uea.edu.br.pagamentos_api.service.exception;

public class RecursoEmUsoException extends RuntimeException {

    public RecursoEmUsoException(String message) {
        super(message);
    }

    public RecursoEmUsoException(String message, Throwable cause) {
        super(message, cause);
    }
}