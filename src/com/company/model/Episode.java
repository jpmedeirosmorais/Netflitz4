package com.company.model;

public class Episode {
    private Season seasonN;
    private String title;
    private String duration;

    public Episode(Season seasonN, String title, String duration) {
        this.seasonN = seasonN;
        this.title = title;
        this.duration = duration;
    }

    public Season getSeasonN() {
        return seasonN;
    }

    public void setSeasonN(Season seasonN) {
        this.seasonN = seasonN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
