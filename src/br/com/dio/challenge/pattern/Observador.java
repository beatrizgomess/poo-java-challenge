package br.com.dio.challenge.pattern;

import br.com.dio.challenge.domain.Bootcamp;

public interface Observador {


    void enviarNotificacao(Bootcamp bootcamp);
}
