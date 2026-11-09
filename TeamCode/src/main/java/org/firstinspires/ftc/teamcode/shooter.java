package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class shooter extends OpMode {
    DcMotor shooter;

    @Override
    public void init() {
        shooter = hardwareMap.get(DcMotor.class, "shooter");
        shooter.setDirection(DcMotorSimple.Direction.FORWARD);
        shooter.setPower(0);
    }

    @Override
    public void loop() {
        double forward = gamepad1.left_stick_y;
        shooter.setPower( forward);
    }
}
// untuk mutarin shooter, pake stick