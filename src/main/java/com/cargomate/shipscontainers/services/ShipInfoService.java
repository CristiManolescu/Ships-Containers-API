package com.cargomate.shipscontainers.services;

import com.cargomate.shipscontainers.model.Ship;
import com.cargomate.shipscontainers.ShipsObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ShipInfoService {

    private final ShipsObjectMapper shipsObjectMapper = new ShipsObjectMapper();

    @GetMapping("/get-all-ships")
    @ResponseBody
    public List<Ship> getAllShips() {
        return shipsObjectMapper.getShips();
    }

    @GetMapping("/get-ship")
    @ResponseBody
    public Optional<Ship> getShipById(@RequestParam(name = "id") long id) {
        Optional<Ship> shipByid = Optional.empty();
        for (Ship ship : shipsObjectMapper.getShips()) {
            if (ship.getId() == id) {
                shipByid = Optional.of(ship);
                break;
            }
        }
        return shipByid;
    }

    @GetMapping("/get-ships-by-owner")
    @ResponseBody
    public List<Ship> getShipsByOwner(@RequestParam(name = "owner") String owner) {
        List<Ship> ships = new ArrayList<>();

        for (Ship ship : shipsObjectMapper.getShips()) {
            if (ship.getOwner().equals(owner)) {
                ships.add(ship);
            }
        }

        return ships;
    }
}
