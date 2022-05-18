package com.example.wetherapiakmaralabdylmanapkyzyakmaralain_2_20.data;

import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.SerializedName;

public class Forecastday {
    @SerializedName("day")
    private Day day;

    @SerializedName("astro")
    private Astro astro;

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }
}