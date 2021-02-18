// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

  private VictorSP frontLeft; 
  private VictorSP backLeft;
  private VictorSP frontRight;
  private VictorSP backRight;

  private SpeedControllerGroup left;
  private SpeedControllerGroup right;
  
  private DifferentialDrive drive;

  /** Creates a new Drivetrain. */
  public Drivetrain() {
    frontLeft = new VictorSP(0);
    backLeft = new VictorSP(1);
    frontRight = new VictorSP(2);
    frontLeft = new VictorSP(3);

    left = new SpeedControllerGroup(frontLeft, backLeft);
    right = new SpeedControllerGroup(frontRight, backRight);

    //left.setInverted(true);

    drive = new DifferentialDrive(left, right);

    drive.setSafetyEnabled(false);
  }

  public void drive (double x, double y) {
    drive.arcadeDrive(x, y);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
