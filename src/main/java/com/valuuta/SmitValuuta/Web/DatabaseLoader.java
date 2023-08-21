package com.valuuta.SmitValuuta.Web;

import com.valuuta.SmitValuuta.valuuta.Valuuta;
import com.valuuta.SmitValuuta.valuuta.ValuutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ValuutaRepository repository;

    @Autowired
    public DatabaseLoader(ValuutaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<Valuuta> valuutas = List.of(
                new Valuuta(1L, "dollar", 1.0867, "$"),
                new Valuuta(2L, "rootsi kroon", 11.9383, "kr"),
                new Valuuta(3L, "austraalia dollar", 1.699, "AUD"),
                new Valuuta(4L, "bulgaaria leev", 1.9558, "$"),
                new Valuuta(5L, "dollar3", 0.92, "$"),
                new Valuuta(6L, "dollar4", 0.92, "$"),
                new Valuuta(7L, "dollar5", 0.92, "$"),
                new Valuuta(8L, "dollar67", 0.92, "$"),
                new Valuuta(9L, "dollar77", 0.92, "$")
        );
        repository.saveAll(valuutas);
    }
}