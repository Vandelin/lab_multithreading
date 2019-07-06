package edu.iis.mto.multithread;

import org.junit.Rule;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BetterRadarTest {

    @Rule
    public RepeatRule reapeatRule = new RepeatRule();

    private BetterRadar radar;
    private int rockets;

    @Test
    @RepeatRule.Repeat(times = 10000)
    public void launchPatriotOnceWhenNoticesAScudMissle() {
        rockets = 10;
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        radar = new BetterRadar(batteryMock, new SingleRocketLauncher(), rockets);
        radar.notice(new Scud());
        verify(batteryMock, times(rockets)).launchPatriot();
    }

}
