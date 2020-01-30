package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Format {
    private double longEdge;
    private OrientationType orientation;
    private double shortEdge;
    private LengthUnitType units;

    public double getLongEdge() {
        return longEdge;
    }

    public void setLongEdge(double longEdge) {
        this.longEdge = longEdge;
    }

    public double getShortEdge() {
        return shortEdge;
    }

    public void setShortEdge(double shortEdge) {
        this.shortEdge = shortEdge;
    }

    public LengthUnitType getUnits() {
        return units;
    }

    public void setUnits(LengthUnitType units) {
        this.units = units;
    }

    public OrientationType getOrientation() {
        return orientation;
    }

    public void setOrientation(OrientationType orientation) {
        this.orientation = orientation;
    }


}
