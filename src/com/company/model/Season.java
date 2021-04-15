package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Season {
    private int title;
    private int duration;

    private List<Episode> episode;

    public Season(int title, int duration) {
        this.title = title;
        this.duration = duration;
        this.episode = new ArrayList<Episode>();
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Episode> getEpisode() {
        return episode;
    }

    public void setEpisode(List<Episode> episode) {
        this.episode = episode;
    }
}
