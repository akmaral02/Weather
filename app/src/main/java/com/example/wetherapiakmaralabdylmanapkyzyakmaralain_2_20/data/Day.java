package com.example.wetherapiakmaralabdylmanapkyzyakmaralain_2_20.data;

import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.SerializedName;

public class Day {
    @SerializedName("maxtemp_c")
    private String maxtemp;

    @SerializedName("mintemp_c")
    private String mintemp;

    public String getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(String maxtemp) {
        this.maxtemp = maxtemp;
    }

    public String getMintemp() {
        return mintemp;
    }

    public void setMintemp(String mintemp) {
        this.mintemp = mintemp;
    }
}