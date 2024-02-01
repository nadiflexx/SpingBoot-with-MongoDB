package org.sportsdata.api;

import lombok.AllArgsConstructor;
import org.sportsdata.model.*;
import org.sportsdata.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Marchandising API class that collect the information from the API.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("merchandising")
@AllArgsConstructor
public class MerchandisingApi {
    @Autowired
    private Service service;

    /**
     * Calls a Service function to save a Merchandising Object.
     *
     * @param merchandising representing a Merchandising object from the body of the
     *                      API.
     * @return a Merchandising object.
     */
    @PostMapping("/save")
    public Merchandising saveMerchandising(@RequestBody Merchandising merchandising) {
        return service.saveMerchandising(merchandising);
    }

    /**
     * Calls a Service function to show a Merchandising object by its Id.
     *
     * @param id representing an Integer from the path variable of the API.
     * @return a Merchandising object or a null.
     */
    @GetMapping("/{id}")
    public Optional<Merchandising> getMerchandisingByID(@PathVariable("id") Integer id) {
        return service.getMerchandisingByID(id);
    }

    /**
     * Calls a Service function to show all the Merchandising objects in the
     * database.
     *
     * @return an ArrayList of Merchandising objects.
     */
    @GetMapping("")
    public ArrayList<Merchandising> getAllMerchandising() {
        return service.getAllMerchandising();
    }

    /**
     * Calls a Service function to show all the Merchandising objects with the same
     * type.
     *
     * @param tipo representing a String from the request parameter of the API.
     * @return an ArrayList of Merchandising objects.
     */
    @GetMapping("/tipo")
    public ArrayList<Merchandising> getMerchandisingByTipo(@RequestParam String tipo) {
        return service.getMerchandisingByTipo(tipo);
    }
}