/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //PWM
    public final static int TALONSR_FEEDER_PORT = 0;
    public final static int TALONSR_CONVEYOR_PORT = 1;
    public final static int TALONSR_ROULETTE_PORT = 2;
    public final static int TALONSR_HOOK_PORT = 6;
    //CAN
    public final static int TALONSRX_TANK_LEFT_PORT = 2;
    public final static int TALONSRX_TANK_RIGHT_PORT = 1;
    public final static int TALONSRX_LAUNCHER_PORT = 3;
    //Joystick
    public final static int JOYSTICK_PORT = 0;
    //Solenoid
    public final static int SOLENOID_PORT_ONE = 6;
    public final static int SOLENOID_PORT_TWO = 7;
    //Joystick button
    public final static int JOYSTICK_BUTTON_SHOOT = 1;
    public final static int JOYSTICK_BUTTON_CONVEYOR = 2;
    public final static int JOYSTICK_BUTTON_ROULETTE = 3;
}
