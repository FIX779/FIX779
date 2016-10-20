/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie5.Plants;

import hometask.Zadanie5.Interfeses.Peellable;

/**
 *
 * @author FIX
 */
public abstract class Plant implements Peellable {

    public String name;
    public double mass;
    public double massP;
    public double massCS;
    private String color;
    private boolean maturity;
    private boolean condition;
    public boolean cleaned;

    public Plant(String color, boolean maturity, boolean condition, boolean cleaned) {

        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
        this.cleaned = cleaned;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMaturity() {
        return maturity;
    }

    public void setMaturity(boolean maturity) {
        this.maturity = maturity;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public String isCleaned() {
        if (cleaned == true) {
            return "очищен";
        } else {
            return "не очищен";
        }
    }

    public void setCleaned(boolean cleaned) {
        this.cleaned = cleaned;
    }

    public double getMass() {
        return mass;
    }

    public double getMassCS() {
        return massCS;
    }

    public void setMassCS(double massCS) {
        this.massCS = massCS;
    }

}
