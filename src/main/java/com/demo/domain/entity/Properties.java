package com.demo.domain.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rmiao on 11/3/2016.
 */
public class Properties {
    private String location;
    private List<String> files = new ArrayList<String>();

    public Properties() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "location='" + location + '\'' +
                ", files=" + files +
                '}';
    }
}
