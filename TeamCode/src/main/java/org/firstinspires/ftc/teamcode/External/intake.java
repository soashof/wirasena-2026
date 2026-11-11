package org.firstinspires.ftc.teamcode.External;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class intake extends LinearOpMode {
     DcMotor intake;

    @Override
    public void runOpMode() throws InterruptedException {
        intake = hardwareMap.get(DcMotor.class, "intake");
        intake.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while (opModeIsActive()){
            intake.setPower(1.0);
        }
    }

}
