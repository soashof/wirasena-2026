//package org.firstinspires.ftc.teamcode.External;
//
//import com.acmerobotics.dashboard.FtcDashboard;
//import com.acmerobotics.dashboard.config.Config;
//import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.hardware.PIDFCoefficients;
//
//@TeleOp(name = "Shooter")
//@Config
//public class shooter extends OpMode {
//
//    private DcMotorEx shooter;
//
//    public static double kP = 10.0;
//    public static double kF = 10.0;
//    public static double target = 1800; // ticks per second
//
//    @Override
//    public void init() {
//        telemetry = new MultipleTelemetry(
//                telemetry,
//                FtcDashboard.getInstance().getTelemetry()
//        );
//
//        shooter = hardwareMap.get(DcMotorEx.class, "shooter");
//
//        shooter.setDirection(DcMotorSimple.Direction.REVERSE);
//        shooter.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
////        shooter.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        shooter.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
//
//        shooter.setPIDFCoefficients(
//                DcMotor.RunMode.RUN_USING_ENCODER,
//                new PIDFCoefficients(kP, 0, 0, kF)
//        );
//    }
//
//    @Override
//    public void loop() {
//        shooter.setPIDFCoefficients(
//                DcMotor.RunMode.RUN_USING_ENCODER,
//                new PIDFCoefficients(kP, 0, 0, kF)
//        );
//
//        shooter.setVelocity(target);
//
//        telemetry.addData("Velocity", shooter.getVelocity());
//        telemetry.addData("POS", shooter.getCurrentPosition());
//        telemetry.addData("Target", target);
//        telemetry.addData("KF", kF);
//        telemetry.addData("KP", kP);
//        telemetry.addData("Y Pressed", gamepad1.y);
//        telemetry.update();
//    }
//}