package org.usfirst.frc.team102.robot.commands;

import org.usfirst.frc.team102.robot.Robot;

import Team102Lib.MessageLogger;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopAllMotors extends Command {
	public StopAllMotors() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.wallyDriveTrain);
		requires(Robot.wallyTurntable);
		requires(Robot.wallyArmSystem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		MessageLogger.LogMessage(this.getClass().getName());
		Robot.wallyDriveTrain.TurnOffMotors();
		Robot.wallyTurntable.turntableMotor.set(0.0);
		Robot.wallyArmSystem.StopMoveArm(0);
		Robot.wallyArmSystem.StopMoveArm(1);
		Robot.wallyArmSystem.StopMoveArm(2);
		Robot.wallyArmSystem.StopMoveArm(3);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		MessageLogger.LogMessage(this.getClass().getName());
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
