package com.pp.SportsAdda.payloads.ExternalAPI;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LiveSports {
    private List<Stage> stages;

    @JsonProperty("Stages")
    public List<Stage> getStages() { return stages; }
    @JsonProperty("Stages")
    public void setStages(List<Stage> value) { this.stages = value; }
}
