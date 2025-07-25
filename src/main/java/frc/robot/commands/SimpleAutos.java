// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

/**
 * Factory methods for simple autos that do not use path planner.
 */
public final class SimpleAutos {
  /** Example static factory for an autonomous command. */
  public static Command doNothing() {
    return Commands.print("Do nothing auto.");
  }

  private SimpleAutos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
