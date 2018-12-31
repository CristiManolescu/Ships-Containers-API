package com.cargomate.shipscontainers;

import com.cargomate.shipscontainers.model.Root;
import com.cargomate.shipscontainers.model.Ship;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ShipsObjectMapper {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private List<Ship> ships;

    public ShipsObjectMapper() {
        this.ships = getShipsFromJson();
    }

    private List<Ship> getShipsFromJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Ship> ships = Collections.emptyList();
        try {
            File file = new ClassPathResource("ships.json").getFile();
            ships = objectMapper.readValue(file, Root.class).getShips();
        } catch (IOException e) {
            logger.error("Ships file not found.", e.getStackTrace());
        }
        return ships;
    }

    public List<Ship> getShips() {
        return ships;
    }
}
