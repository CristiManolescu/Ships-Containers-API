package com.cargomate.shipscontainers.model;

/**
 * This is a Ship POJO to represent a ship object from the json.
 */
public class Ship {
    /**
     * This is the unique identifier of the ship.
     */
    private long id;

    /**
     * This is the year when the ship was build.
     */
    private int built;

    /**
     * This is the name of the ship.
     */
    private String name;

    /**
     * This is the length of the ship in the metric system.
     */
    private double lengthMeters;

    /**
     * The overall width of the ship measured at the widest point of the nominal waterline.
     */
    private double beamMeters;

    /**
     * This is the value for the maximum Twenty-foot equivalent unit (TEU) capacity.
     */
    private int maxTEU;

    /**
     * This is the name of the owner of the ship.
     */
    private String owner;

    /**
     * A nonlinear measure of the ships' overall internal volume.
     */
    private String grossTonnage;

    @Override
    public String toString() {
        return "Ship{" +
                "id=" + id +
                ", built=" + built +
                ", name='" + name + '\'' +
                ", lengthMeters=" + lengthMeters +
                ", beamMeters=" + beamMeters +
                ", maxTEU=" + maxTEU +
                ", owner='" + owner + '\'' +
                ", grossTonnage=" + grossTonnage +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBuilt() {
        return built;
    }

    public void setBuilt(int built) {
        this.built = built;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLengthMeters() {
        return lengthMeters;
    }

    public void setLengthMeters(double lengthMeters) {
        this.lengthMeters = lengthMeters;
    }

    public double getBeamMeters() {
        return beamMeters;
    }

    public void setBeamMeters(double beamMeters) {
        this.beamMeters = beamMeters;
    }

    public int getMaxTEU() {
        return maxTEU;
    }

    public void setMaxTEU(int maxTEU) {
        this.maxTEU = maxTEU;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGrossTonnage() {
        return grossTonnage;
    }

    public void setGrossTonnage(String grossTonnage) {
        this.grossTonnage = grossTonnage;
    }
}
