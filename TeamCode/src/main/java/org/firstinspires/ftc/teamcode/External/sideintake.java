package org.firstinspires.ftc.teamcode.External;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class sideintake extends LinearOpMode {
    private CRServo left;
    private CRServo right;

    @Override
    public void runOpMode() {
        left = hardwareMap.get(CRServo.class, "servoLeft");
        right = hardwareMap.get(CRServo.class, "servoRight");

        left.setDirection(DcMotorSimple.Direction.FORWARD);
        right.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive()) {

            if (gamepad1.dpad_down) {
                left.setPower(1);
                right.setPower(1);
            } else {
                left.setPower(0);
                right.setPower(0);
            }
        }
    }
}
//autonomous