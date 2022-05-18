package com.example.wetherapiakmaralabdylmanapkyzyakmaralain_2_20.data;

import com.google.gson.annotations.SerializedName;

public class Condition {
    @SerializedName("text")
    private String condition;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}