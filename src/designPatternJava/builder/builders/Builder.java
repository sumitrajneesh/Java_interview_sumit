package designPatternJava.builder.builders;

import designPatternJava.builder.cars.CarType;
import designPatternJava.builder.components.Transmission;
import designPatternJava.builder.components.Engine;
import designPatternJava.builder.components.GPSNavigator;
import designPatternJava.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
