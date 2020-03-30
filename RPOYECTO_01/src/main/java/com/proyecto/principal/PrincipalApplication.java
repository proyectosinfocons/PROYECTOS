package com.proyecto.principal;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class PrincipalApplication  implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        Flux<String> lista = Flux.just("lista1","lista2","lista2").doOnNext(p->{
           System.out.println(p);

        });
      lista.subscribe();



    }
}
