package com;

class Car {
    private String type;
    private int itemNumber;
    private int dailyRate;
    private String reservationStatus;

    public Car( int itemNumber, String type,  int dailyRate, String reservationStatus) {
        this.itemNumber = itemNumber;
        this.type = type;    
        this.dailyRate = dailyRate;
        this.reservationStatus = reservationStatus;
      
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getType() {
        return type;
    }

    public int getDailyRate() {
        return dailyRate;
    }
    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }


}