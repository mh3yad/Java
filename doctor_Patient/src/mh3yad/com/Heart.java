package mh3yad.com;

public class Heart extends Patient {
    private int heartRate;

    public Heart(String name, String medical_condition, int heartRate) {
        super(name, medical_condition);
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
