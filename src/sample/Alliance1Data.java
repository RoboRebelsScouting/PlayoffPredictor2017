package sample;

/**
 * Created by 1153 on 3/28/2017.
 */
public class Alliance1Data {
    int robot1A1;
    int robot2A1;
    int robot3A1;

    // these numbers are combined averages for the alliance
    double avgAutoFuel1;
    double avgAutoGear1;
    double avgTeleFuel1;
    double avgTeleGear1;
    double avgTeleClimb1;

    // strength of alliance
    double alliance1Strength;

    // given the 5 factors, calculate a strength number
    public void calcStrength1() {
        double strength = 0.0;

        double totalGears1 = avgAutoGear1 + avgTeleGear1;
        int rotors = 0;
        int autoRotors = 0;

        if (avgAutoGear1 >= 1.0 && avgAutoGear1 < 3.0) {
            strength += 60;
            autoRotors = 1;
        }else if (avgAutoGear1 == 3.0) {
            strength += 120;
            autoRotors = 2;
        }

        // gears needed for rotors:
        // 1 gear = 1 rotor
        // 3 gears = 2 rotors
        // 7 gears = 3 rotors
        // 13 gears = 4 rotors
        //assume they get the free gear

        if (totalGears1 >= 12) {
            rotors = 4;
        } else if (totalGears1 >= 6) {
            rotors = 3;
        } else if (totalGears1 >= 2) {
            rotors = 2;
        } else if (totalGears1 >= 0) {
            rotors = 1;
        } else {
            rotors = 0;
        }

        int teleRotors = rotors - autoRotors;
        // 40 points for each rotor in tele
        strength += (teleRotors * 40);
        if (rotors == 4) {
            strength += 100;
        }
        strength += avgAutoFuel1;
        strength += avgTeleFuel1;
        if (avgAutoFuel1 + avgTeleFuel1 >= 40) {
            strength += 20;
        }
        int climbPoints1 = (int)(avgTeleClimb1) * 50;
        strength += climbPoints1;

        alliance1Strength = strength;
    }
}
