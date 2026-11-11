package org.firstinspires.ftc.teamcode.External;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp

public class motor extends OpMode {
    DcMotor kiri, kanan;
    private CRServo servoKiri;
    private CRServo servoKanan;

    @Override
    public void init() {
        kiri = hardwareMap.get(DcMotor.class, "kiri");
        kanan = hardwareMap.get(DcMotor.class, "kanan");

        kiri.setDirection(DcMotorSimple.Direction.FORWARD);
        kanan.setDirection(DcMotorSimple.Direction.REVERSE);

        servoKiri = hardwareMap.get(CRServo.class, "ServoKiri");
        servoKanan = hardwareMap.get(CRServo.class, "ServoKanan");

        servoKiri.setDirection(DcMotorSimple.Direction.FORWARD);
        servoKanan.setDirection(DcMotorSimple.Direction.REVERSE);
        telemetry.addData("status", "init");
        telemetry.addLine();
    }

    @Override
    public void loop(){
        double forward = gamepad1.left_stick_y;
        double rotate = gamepad1.left_stick_x;

        kiri.setPower(forward + rotate);
        kanan.setPower(forward - rotate);

        double trigger = gamepad1.left_trigger;
        if (trigger > 0.1) {
            servoKiri.setPower(1);
            servoKanan.setPower(1);
        } else if (gamepad1.right_bumper) {
            servoKanan.setPower(-1);
            servoKiri.setPower(-1);

        } else {
            servoKiri.setPower(0);
            servoKanan.setPower(0);
        }

    }
}


