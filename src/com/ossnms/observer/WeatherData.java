/*
 * Copyright (C) Coriant
 * The reproduction, transmission or use of this document or its contents 
 * is not permitted without express written authorization.
 * Offenders will be liable for damages.
 * All rights, including rights created by patent grant or 
 * registration of a utility model or design, are reserved.
 * Modifications made to this document are restricted to authorized personnel only. 
 * Technical specifications and features are binding only when specifically 
 * and expressly agreed upon in a written contract.
 *
 */

package com.ossnms.observer;

import java.util.Observable;


public class WeatherData extends Observable {

    private Data data;

    public void setMeasurments(Data data) {
        this.data = data;
        measurmentsChanged();
    }

    public void measurmentsChanged() {
        setChanged();
        notifyObservers(data);
    }
}
