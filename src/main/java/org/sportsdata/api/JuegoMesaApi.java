package org.sportsdata.api;

import lombok.AllArgsConstructor;
import org.sportsdata.model.*;
import org.sportsdata.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Table Game API class that collect the information from the API.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("mesa")
@AllArgsConstructor
public class JuegoMesaApi {
    @Autowired
    private Service service;

    /**
     * Calls a Service function to save a JuegoMesa Object.
     *
     * @param juegoMesa representing a JuegoMesa object from the body of the API.
     * @return a JuegoMesa object.
     */
    @PostMapping("/save")
    public JuegoMesa saveJuegoMesa(@RequestBody JuegoMesa juegoMesa) {
        return service.saveJuegoMesa(juegoMesa);
    }

    /**
     * Calls a Service function to show a JuegoMesa object by its Id.
     *
     * @param id representing an Integer from the path variable of the API.
     * @return a JuegoMesa object or a null.
     */
    @GetMapping("/{id}")
    public Optional<JuegoMesa> getJuegoMesaById(@PathVariable("id") Integer id) {
        return service.getJuegoMesaById(id);
    }

    /**
     * Calls a Service function to update the description and type of a JuegoMesa
     * object.
     *
     * @param id          representing an Integer from the path variable of the API.
     * @param descripcion representing a String from the request parameter of the
     *                    API.
     * @param tipo        representing a String from the request parameter of the
     *                    API.
     * @return a JuegoMesa object or a null.
     */
    @PutMapping("/update/{id}")
    public Optional<JuegoMesa> updateJuegoDeMesaById(@PathVariable("id") Integer id, @RequestParam String descripcion,
                                                     @RequestParam String tipo) {
        return service.updateJuegoDeMesaById(id, descripcion, tipo);
    } // .put()

    /**
     * Calls a Service function to delete a JuegoMesa by its id.
     *
     * @param id representing an Integer from the path variable of the API.
     */
    @DeleteMapping("/delete/{id}")
    public void deleteJuegoMesa(@PathVariable("id") Integer id) {
        service.deleteJuegoMesa(id);
    }
}