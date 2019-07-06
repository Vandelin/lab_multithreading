package edu.iis.mto.multithread;


public class SingleRocketLauncher {

    public void launchRockets(PatriotBattery patriotBattery, int rockets) {
        for (int i = 0; i < rockets; i++) {
            patriotBattery.launchPatriot();
        }
    }
}
