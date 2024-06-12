package tddmicroexercises.telemetrysystem;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TelemetryDiagnosticControlsTest {

    @Test
    public void CheckTransmission_should_send_a_diagnostic_message_and_receive_a_status_message_response() {
        // Arrange
        TelemetryClient mockedClient = Mockito.mock(TelemetryClient.class);
        TelemetryDiagnosticControls diagnosticControls = new TelemetryDiagnosticControls();
        diagnosticControls.setDiagnosticInfo("");

        when(mockedClient.getOnlineStatus()).thenReturn(true);
        when(mockedClient.receive()).thenReturn("Mocked diagnostic response");

        // Act
        diagnosticControls.checkTransmission();

        // Assert
        assertEquals("Mocked diagnostic response", diagnosticControls.getDiagnosticInfo());
    }
}
