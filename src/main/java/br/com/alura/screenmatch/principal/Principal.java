package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumoApi;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner (System.in);
    private ConsumoApi consumo = new ConsumoApi ();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";

    private final String API_KEY = "&apikey=479a1bfc";

    public void exibeMenu() {
        System.out.println ("Digite o nome da serie:" );
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados (ENDERECO + nomeSerie.replace( "", "+") + API_KEY);


        //"https://www.omdbapi.com/?t=gilmore+girls&apikey=479a1bfc")
    }
}