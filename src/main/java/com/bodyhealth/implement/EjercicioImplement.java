package com.bodyhealth.implement;

import com.bodyhealth.model.Ejercicio;
import com.bodyhealth.repository.EjercicioRepository;
import com.bodyhealth.service.EjercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjercicioImplement implements EjercicioService {
    @Autowired
    private EjercicioRepository ejercicioRepository;
    @Override
    public List<Ejercicio> listarEjercicios() {
        return (List<Ejercicio>) ejercicioRepository.findAll();
    }

    @Override
    public void guardar(Ejercicio ejercicio) {
        ejercicioRepository.save(ejercicio);
    }

    @Override
    public void eliminar(Ejercicio ejercicio) {
        ejercicioRepository.delete(ejercicio);
    }

    @Override
    public Ejercicio encontrarEjercicio(Ejercicio ejercicio) {

        return ejercicioRepository.findById(ejercicio.getId_ejercicio()).orElse(null);
    }
}
