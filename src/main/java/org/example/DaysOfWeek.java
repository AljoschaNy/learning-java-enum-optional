package org.example;

public enum DaysOfWeek {
    MONDAY("monday", "monday"),
    TUESDAY("tuesday", "tuesday"),
    WEDNESDAY("wednesday", "wednesday"),
    THURSDAY("thursday", "thursday"),
    FRIDAY("friday", "friday"),
    SATURDAY("saturday", "weekend"),
    SUNDAY("sunday", "weekend");

    private final String weekday;
    private final String weekdayType;

    DaysOfWeek(String weekday, String weekDayType) {
        this.weekday = weekday;
        this.weekdayType = weekDayType;
    }

    public String getWeekday() {
        return weekday;
    }

    public String getWeekDayType() {
        return weekdayType;
    }
}