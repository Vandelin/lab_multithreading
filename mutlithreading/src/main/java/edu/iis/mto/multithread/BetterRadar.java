package edu.iis.mto.multithread;

public class BetterRadar {
    private PatriotBattery batteryMock;
    private SingleRocketLauncher singleRocketLauncher;
    private int rockets;

    public BetterRadar(PatriotBattery batteryMock, SingleRocketLauncher singleRocketLauncher, int rockets) {
        this.batteryMock = batteryMock;
        this.singleRocketLauncher = singleRocketLauncher;
        this.rockets = rockets;
    }

    public void notice(Scud missile){
        launchRockets();
    }

    private void launchRockets() {
        singleRocketLauncher.launchRockets(batteryMock, rockets);
    }


}
