package com.valuuta.SmitValuuta.valuuta;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ValuutaService {
    private final ValuutaRepository valuutaRepository;

    @Autowired
    public ValuutaService(ValuutaRepository valuutaRepository) {
        this.valuutaRepository = valuutaRepository;
    }

    public void saveValuuta(Valuuta valuuta) {
        System.out.println( valuuta +" lisatud" );

        valuutaRepository.save(valuuta);
    }

    @Transactional
    public void updateValuuta(Valuuta valuuta){
        Valuuta val = valuutaRepository.findValuutaById(valuuta.getId()).orElseThrow(
                ()->new IllegalStateException("cannot update")
        );
        System.out.println(valuuta + " uuednatud");

        val.setNimi(valuuta.getNimi());
        val.setVaartus(valuuta.getVaartus());
        val.setSümbol(valuuta.getSümbol());
    }
    public void deleteValuta(Valuuta valuuta){

        Valuuta val = valuutaRepository.findValuutaById(valuuta.getId()).orElseThrow(
                ()-> new IllegalStateException("NO id to delete")
        );
        System.out.println(valuuta + " kustutatud");
        valuutaRepository.delete(val);
    }

    public List<Valuuta> getValutas() {
        System.out.println("Valuutad saadetud");

        return valuutaRepository.findAll();
    }
}