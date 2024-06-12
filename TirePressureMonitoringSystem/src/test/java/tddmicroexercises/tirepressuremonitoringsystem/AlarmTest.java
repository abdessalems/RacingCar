package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AlarmTest {

    @Test
    public void testIsAlarmOnWhenCreated() {
        Sensor mockSensor = new Sensor() {
            @Override
            public double popNextPressurePsiValue() {
                return 18; // Simulate normal pressure value
            }
        };

        Alarm alarm = new Alarm(mockSensor);
        alarm.check();

        assertFalse(alarm.isAlarmOn());
    }
}
