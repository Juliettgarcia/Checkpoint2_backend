package br.com.juliettgarcia.projetoClinicaCP2.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestCnpjException extends RuntimeException{
    public BadRequestCnpjException(String Cnpj) {
        super("O CNPJ: " + Cnpj + " já existe.");
    }

}
