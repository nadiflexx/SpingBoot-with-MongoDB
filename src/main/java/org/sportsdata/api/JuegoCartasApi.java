package org.sportsdata.api;

import lombok.AllArgsConstructor;
import org.sportsdata.model.*;
import org.sportsdata.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Card Game API class that collect the information from the API.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("cartas")
@AllArgsConstructor
public class JuegoCartasApi {
    @Autowired
    private Service service;

    /**
     * Calls a Service function to save a JuegoCartas object.
     *
     * @param cartas representing a JuegoCartas object from the body of the API.
     * @return a JuegoCartas object.
     */
    @PostMapping("/save")
    public JuegoCartas saveJuegoCartas(@RequestBody JuegoCartas cartas) {
        return service.saveJuegoCartas(cartas);
    }

    /**
     * Calls a Service function to show a JuegoCartas object by its id.
     *
     * @param id representing an Integer from the path variable of the API.
     * @return a JuegoCartas object or a null.
     */
    @GetMapping("/{id}")
    public Optional<JuegoCartas> getJuegoCartasById(@PathVariable("id") Integer id) {
        return service.getJuegoCartasById(id);
    }

    /**
     * Calls a Service function to change a JuegoCartas object by another one.
     *
     * @param id     representing an Integer from the path variable of the API.
     * @param cartas representing a JuegoCartas object from the body of the API.
     * @return a JuegoCartas object or a null.
     */
    @PutMapping("/change/{id}")
    public JuegoCartas changeJuegoDeCartasById(@PathVariable("id") Integer id, @RequestBody JuegoCartas cartas) {
        return service.changeJuegoDeCartasById(id, cartas);
    }

    /**
     * Calls a Service function to show JuegoCartas objects that have the same
     * season.
     *
     * @param temporada representing an Integer from the path variable of the API.
     * @return an ArrayList of JuegoCartas objects.
     */
    @GetMapping("/temporada/{temporada}")
    public ArrayList<JuegoCartas> getJuegoCartasByTemporada(@PathVariable("temporada") Integer temporada) {
        return service.getJuegoCartasByTemporada(temporada);
    }
}