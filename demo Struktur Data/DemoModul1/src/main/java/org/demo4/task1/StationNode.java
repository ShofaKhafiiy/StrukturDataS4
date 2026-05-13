package org.demo4.task1;

import java.util.ArrayList;
import java.util.List;

public class StationNode {



    private String stationCode;
    private String stationName;
    private String region;

    private List<StationNode> children;
    private StationNode parent;



    public StationNode(String stationCode,
                       String stationName,
                       String region) {

        this.stationCode = stationCode;
        this.stationName = stationName;
        this.region = region;

        children = new ArrayList<>();
        parent = null;
    }

    public void addChild(StationNode child) {

        child.parent = this;

        children.add(child);
    }



    public void removeChild(StationNode child) {

        children.remove(child);
    }



    public boolean isLeaf() {

        return children.isEmpty();
    }



    public String getStationCode() {
        return stationCode;
    }

    public String getStationName() {
        return stationName;
    }

    public String getRegion() {
        return region;
    }

    public List<StationNode> getChildren() {
        return children;
    }

    public StationNode getParent() {
        return parent;
    }



    @Override
    public String toString() {

        return stationCode + " - "
                + stationName
                + " (" + region + ")";
    }
}