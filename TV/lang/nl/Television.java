package TV.lang.nl;

public class Television {

    //Attributen
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;

    //Methoden
    public void turnOn() {
        if (!on) {
            on = true;
            System.out.println("De TV staat nu aan.");
        } else {
            System.out.println("De TV staat al aan =/");
        }
    }

    public void turnOff() {
        if (on) {
            on = false;
            System.out.println("De TV staat nu uit.");
        } else {
            System.out.println("De TV staat al uit =/");
        }
    }

    public void setChannel(int newChannel) {
        if (on) {
            this.channel = newChannel;
            System.out.println("Het kanaal staat nu op " + this.channel);
        } else {
            System.out.println("Je kan alleen zappen als de TV aan staat.");
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on) {
            this.volumeLevel = newVolumeLevel;
            System.out.println("Het volume staat nu op " + this.volumeLevel);
        } else {
            System.out.println("Je kan alleen het volume aanpassen als de TV aan staat.");
        }
    }

    public void channelUp() {
        if (on) {
            if (channel < 10) {
                channel++;
                System.out.println("De TV staat nu op " + channel + ".");
            } else {
                System.out.println("Je kan niet hoger dan 10.");
            }
        } else {
            System.out.println("Je kan alleen zappen als de TV aan staat.");
        }
    }
    public void channelDown() {
        if (on) {
            if (channel > 1) {
                channel--;
                System.out.println("De TV staat nu op " + channel + ".");
            } else {
                System.out.println("Je kan niet lager dan 1.");
            }
        } else {
            System.out.println("Je kan alleen zappen als de TV aan staat.");
        }
    }
    public void volumeUp() {
        if (on) {
            if (volumeLevel < 20) {
                volumeLevel++;
                System.out.println("De TV Volume staat nu op " + volumeLevel + ".");
            } else {
                System.out.println("Het volume kan niet hoger dan 20.");
            }
        } else {
            System.out.println("Je kan alleen het volume aanpassen als de TV aan staat.");
        }
    }
    public void volumeDown() {
        if (on) {
            if (volumeLevel > 0) {
                volumeLevel--;
                System.out.println("De TV Volume staat nu op " + volumeLevel + ".");
            } else {
                System.out.println("Het volume kan niet lager dan 0.");
            }
        } else {
            System.out.println("Je kan alleen het volume aanpassen als de TV aan staat.");
        }
    }

    public boolean isOn() {
        return on;
    }
}
