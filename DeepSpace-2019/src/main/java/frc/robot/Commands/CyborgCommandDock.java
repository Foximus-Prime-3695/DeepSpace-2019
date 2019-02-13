/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Commands;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class CyborgCommandDock extends Command {
  public CyborgCommandDock() {
    requires(Robot.SUB_DRIVE);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    PIDSource source = new PIDSource(){
    
      @Override
      public void setPIDSourceType(PIDSourceType pidSource) {
        
      }
    
      @Override
      public double pidGet() {
        return 0;
      }
    
      @Override
      public PIDSourceType getPIDSourceType() {
        return PIDSourceType.kDisplacement;
      }
    };


    PIDOutput output = new PIDOutput(){
    
      @Override
      public void pidWrite(double output) {
        
      }

    };

    PIDController turning = new PIDController(0, 0, 0, source, output);
    // if (canSee)
      // left wheel = constant speed + bang-bang turning
      // right wheel = constant speed + bang-bang turning
    // else if (within range)
      // left wheel = constant speed
      // right wheel = constant speed
    // else
      // rotate toward the side it was on last
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    // return drivetrain amps > pushing for x time
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
