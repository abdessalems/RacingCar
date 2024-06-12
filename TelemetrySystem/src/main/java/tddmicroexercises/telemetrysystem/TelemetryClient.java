package tddmicroexercises.telemetrysystem;

import java.util.Random;

public class TelemetryClient
{
    private boolean onlineStatus;
    private String diagnosticMessageResult = "";

    Random connectionEventsSimulator;

    public static final String DIAGNOSTIC_MESSAGE = "AT#UD";

    public TelemetryClient() {
        connectionEventsSimulator = new Random(42);
    }

    // Constructor for dependency injection (for testing)
    TelemetryClient(Random connectionEventsSimulator) {
        this.connectionEventsSimulator = connectionEventsSimulator;
    }

}
