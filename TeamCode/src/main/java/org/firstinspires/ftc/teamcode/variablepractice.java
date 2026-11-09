package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class variablepractice extends OpMode {
    @Override
    public void init(){
        int teamNumber = 28731;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        int motorAngle = 90;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw Closed", clawClosed);
        telemetry.addData("Motor Angle", motorAngle);
    }

    @Override
    public void loop(){
    }
}

// nyimpan nilai
