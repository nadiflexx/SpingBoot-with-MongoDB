package org.sportsdata.service;

import org.sportsdata.dao.*;
import org.sportsdata.model.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Represents the manager of the application.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private JuegoCartasDao juegoCartasDao;
    @Autowired
    private JuegoMesaDao juegoMesaDao;
    @Autowired
    private JuegoRolDao juegoRolDao;
    @Autowired
    private MerchandisingDao merchandisingDao;

    /**
     * Inserts a JuegoCartas object to the database.
     *
     * @param cartas representing a JuegoCartas object.
     * @return a JuegoCartas object.
     */
    public JuegoCartas saveJuegoCartas(JuegoCartas cartas) {
        return juegoCartasDao.save(cartas);
    }

    /**
     * Shows a JuegoCartas object by its id from the database.
     *
     * @param id representing an Integer.
     * @return a JuegoCartas object or a null.
     */
    public Optional<JuegoCartas> getJuegoCartasById(Integer id) {
        return juegoCartasDao.findById(id);
    }

    /**
     * Change a JuegoCartas object by another one in the database.
     *
     * @param id     representing an Integer.
     * @param cartas representing a JuegoCartas object.
     * @return a JuegoCartas object or a null.
     */
    public JuegoCartas changeJuegoDeCartasById(Integer id, JuegoCartas cartas) {
        if (juegoCartasDao.findById(id).isEmpty()) {
            System.out.println("Can not delete an unexisting Cards game.");
            return null;
        } else {
            juegoCartasDao.deleteById(id);
            return saveJuegoCartas(cartas);
        }
    }

    /**
     * Shows JuegoCartas objects from the database that have the same season.
     *
     * @param temporada representing an Integer.
     * @return an ArrayList of JuegoCartas objects.
     */
    public ArrayList<JuegoCartas> getJuegoCartasByTemporada(Integer temporada) {
        return juegoCartasDao.findJuegoCartasByTemporada(temporada);
    }

    /**
     * Inserts a JuegoMesa Object to the database.
     *
     * @param juegoMesa representing a JuegoMesa object.
     * @return a JuegoMesa object.
     */
    public JuegoMesa saveJuegoMesa(JuegoMesa juegoMesa) {
        return juegoMesaDao.save(juegoMesa);
    }

    /**
     * Shows a JuegoMesa object from the database by its Id.
     *
     * @param id representing an Integer.
     * @return a JuegoMesa object or a null.
     */
    public Optional<JuegoMesa> getJuegoMesaById(Integer id) {
        return juegoMesaDao.findById(id);
    }

    /**
     * Updates the description and type of a JuegoMesa object from the database.
     *
     * @param id          representing an Integer.
     * @param descripcion representing a String.
     * @param tipo        representing a String.
     * @return a JuegoMesa object or a null.
     */
    public Optional<JuegoMesa> updateJuegoDeMesaById(Integer id, String descripcion, String tipo) {
        Optional<JuegoMesa> juegoMesa = juegoMesaDao.findById(id);
        if (juegoMesa.isPresent()) {
            JuegoMesa juego = juegoMesa.get();
            juego.setDescripcion(descripcion);
            juego.setTipo(tipo);
            juegoMesaDao.save(juego);
        }
        return juegoMesa;
    }

    /**
     * Deletes a JuegoMesa object from the database by its id.
     *
     * @param id representing an Integer.
     */
    public void deleteJuegoMesa(Integer id) {
        if (juegoMesaDao.findById(id).isPresent()) {
            juegoMesaDao.deleteById(id);
            System.out.println("Table game deleted.");
        } else {
            System.out.println("Cannot delete an unexisting table game.");
        }
    }

    /**
     * Inserts a JuegoRol Object into the database.
     *
     * @param juegoRol representing a JuegoRol object.
     * @return a JuegoRol object.
     */
    public JuegoRol saveJuegoRol(JuegoRol juegoRol) {
        return juegoRolDao.save(juegoRol);
    }

    /**
     * Shows a JuegoRol object by its Id from the database.
     *
     * @param id representing an Integer.
     * @return a JuegoRol object or a null.
     */
    public Optional<JuegoRol> getJuegoRolById(Integer id) {
        return juegoRolDao.findById(id);
    }

    /**
     * Updates the level of a JuegoRol object from the database.
     *
     * @param id    representing an Integer.
     * @param nivel representing an Integer.
     * @return a JuegoRol object or a null.
     */
    public Optional<JuegoRol> updateJuegoDeRolById(Integer id, Integer nivel) {
        Optional<JuegoRol> juegoRol = juegoRolDao.findById(id);
        if (juegoRol.isPresent()) {
            JuegoRol juego = juegoRol.get();
            juego.setNivel(nivel);
            juegoRolDao.save(juego);
        }
        return juegoRol;
    }

    /**
     * Shows all the JuegoRol objects from the database.
     *
     * @return an ArrayList of JuegoRol objects.
     */
    public ArrayList<JuegoRol> getAllJuegoRol() {
        return (ArrayList<JuegoRol>) juegoRolDao.findAll();
    }

    /**
     * Inserts a Merchandising Object into the database.
     *
     * @param merchandising representing a Merchandising object.
     * @return a Merchandising object.
     */
    public Merchandising saveMerchandising(Merchandising merchandising) {
        return merchandisingDao.save(merchandising);
    }

    /**
     * Shows a Merchandising object from the database by its Id.
     *
     * @param id representing an Integer.
     * @return a Merchandising object or a null.
     */
    public Optional<Merchandising> getMerchandisingByID(Integer id) {
        return merchandisingDao.findById(id);
    }

    /**
     * Shows all the Merchandising objects in the database.
     *
     * @return an ArrayList of Merchandising objects.
     */
    public ArrayList<Merchandising> getAllMerchandising() {
        return (ArrayList<Merchandising>) merchandisingDao.findAll();
    }

    /**
     * Show all the Merchandising objects with the same type from the database.
     *
     * @param tipo representing a String.
     * @return an ArrayList of Merchandising objects.
     */
    public ArrayList<Merchandising> getMerchandisingByTipo(String tipo) {
        return merchandisingDao.findMerchandisingByTipo(tipo);
    }
}