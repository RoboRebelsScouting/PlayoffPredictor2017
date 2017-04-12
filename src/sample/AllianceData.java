package sample;

import static java.lang.Math.round;

/**
 * Created by 1153 on 3/28/2017.
 */
public class AllianceData {
    int robot1;
    int robot2;
    int robot3;
    int allianceNumber;

    // these numbers are combined averages for the alliance
    double avgAutoFuel;
    double avgAutoGear;
    double avgTeleFuel;
    double avgTeleGear;
    double avgTeleClimb;

    // strength of alliance
    double allianceLowStrength;
    double allianceRawStrength;
    double allianceHighStrength;

    // given the 5 factors, calculate a strength number
    public void calcStrength() {
        double lowStrength = 0.0;
        double highStrength = 0.0;
        double rawStrength = 0.0;

        double totalGears = avgAutoGear + avgTeleGear;
        int rotors = 0;
        int autoRotors = 0;

        if (avgAutoGear >= 1.0 && avgAutoGear < 3.0) {
            rawStrength += 60;
            autoRotors = 1;
        }else if (avgAutoGear == 3.0) {
            rawStrength += 120;
            autoRotors = 2;
        }
        if (round(avgAutoGear) >= 1.0 && round(avgAutoGear) < 3.0) {
            highStrength += 60;
            autoRotors = 1;
        }else if (round(avgAutoGear) == 3.0) {
            highStrength += 120;
            autoRotors = 2;
        }
        if ((int) avgAutoGear >= 1.0 && (int) avgAutoGear < 3.0) {
            lowStrength += 60;
            autoRotors = 1;
        }else if ((int)avgAutoGear == 3.0) {
            lowStrength += 120;
            autoRotors = 2;
        }

        // gears needed for rotors:
        // 1 gear = 1 rotor
        // 3 gears = 2 rotors
        // 7 gears = 3 rotors
        // 13 gears = 4 rotors
        //assume they get the free gear

        if (totalGears >= 12) {
            rotors = 4;
        } else if (totalGears >= 6) {
            rotors = 3;
        } else if (totalGears >= 2) {
            rotors = 2;
        } else if (totalGears >= 0) {
            rotors = 1;
        } else {
            rotors = 0;
        }

        int teleRotors = rotors - autoRotors;
        // 40 points for each rotor in tele
        lowStrength += (teleRotors * 40);
        highStrength += (teleRotors * 40);
        rawStrength += (teleRotors * 40);
        if (rotors == 4) {
            lowStrength += 100;
            rawStrength += 100;
            highStrength += 100;
        }
        lowStrength += avgAutoFuel;
        lowStrength += avgTeleFuel;
        if (avgAutoFuel + avgTeleFuel >= 40) {
            lowStrength += 20;
            highStrength += 20;
            rawStrength += 20;
        }
        int climbPoints = (int)(avgTeleClimb) * 50;
        lowStrength += climbPoints;

        climbPoints = (int) (round (avgTeleClimb)) *50;
        highStrength += climbPoints;

        climbPoints = (int) (avgTeleClimb*50);
        rawStrength += climbPoints;

        allianceLowStrength = lowStrength;
        allianceHighStrength = highStrength;
        allianceRawStrength = rawStrength;
    }
}
