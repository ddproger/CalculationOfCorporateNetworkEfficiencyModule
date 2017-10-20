package ua.gerasymiuk.CalculationOfDataTransmissionEfficiency.Services;

/**
 * Created by gerasymiuk on 18.10.17.
 */
public interface Technology {
    int getN();
    double getP();
    double getT();
    int getV();
    int getCapacity();
    double getWeff();
    double getWnorm();
    long getC();
}
