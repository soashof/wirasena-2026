package org.firstinspires.ftc.teamcode.procedures;

import android.content.pm.LauncherApps;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class stringpractice extends OpMode {
    @Override
    public void init(){
        String myName = "Laksmi";

        telemetry.addData("Hello", myName);
    }
@Override
    public void loop(){

}
}
