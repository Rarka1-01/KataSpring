package model;

import java.util.Objects;

public class Car {
    private String type;
    private int series;
    private String mark;

    public Car() {
        this.type = "";
        this.mark = "";
        this.series = -1;
    }

    public Car(String type, int series, String mark) {
        this.type = type;
        this.series = series;
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(type, car.type) && Objects.equals(mark, car.mark);
    }

    @Override
    public int hashCode() {
        long modelBits = (type != null) ? type.hashCode() : 0;
        long markBits = (mark != null) ? mark.hashCode() : 0;

        int result = (int) (modelBits ^ (modelBits >>> 32));
        result = 31 * result + series;
        result = 31 * result + (int) (markBits ^ (markBits >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", series=" + series +
                ", mark='" + mark + '\'' +
                '}';
    }
}
