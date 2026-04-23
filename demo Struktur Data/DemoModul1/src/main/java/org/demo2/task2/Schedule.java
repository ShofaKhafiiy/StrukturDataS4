package org.demo2.task2;

public class Schedule {

    private int scheduleId;
    private String trainCode;
    private String trainName;
    private String origin;
    private String destination;
    private String departureTime;
    private double baseFare;

    private static int counter = 1;

    // Constructor
    public Schedule(String trainCode, String trainName, String origin,
                    String destination, String departureTime, double baseFare) {
        this.scheduleId = counter++;
        this.trainCode = trainCode;
        this.trainName = trainName;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.baseFare = baseFare;
    }

    // Getter
    public int getScheduleId() { return scheduleId; }
    public String getTrainCode() { return trainCode; }
    public String getTrainName() { return trainName; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
    public double getBaseFare() { return baseFare; }

    // Setter
    public void setTrainName(String trainName) { this.trainName = trainName; }
    public void setOrigin(String origin) { this.origin = origin; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }
    public void setBaseFare(double baseFare) { this.baseFare = baseFare; }

    // Display
    public void displayInfo() {
        System.out.println("ID: " + scheduleId +
                " | " + trainCode +
                " | " + trainName +
                " | " + origin + " -> " + destination +
                " | " + departureTime +
                " | Fare: " + baseFare);
    }
}