package com.cargomate.shipscontainers.model;

import java.util.List;

/**
 * This is the root of the json which contains the collection of ships.
 */
public class Root {
    private List<Ship> ships;

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    @Override
    public String toString() {
        return "Root{" +
                "ships=" + ships +
                '}';
    }
}
