package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * This is a method.
   * @param someone Someone's name.
   * @return String saying hello to someone.
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
