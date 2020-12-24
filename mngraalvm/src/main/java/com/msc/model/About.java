package com.msc.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

import java.io.Serializable;

@Introspected
@JsonAutoDetect
public class About implements Serializable {

    @JsonProperty
    private String version;

    public About(){
        this.version = "v0.1";
    }

    @JsonProperty
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
