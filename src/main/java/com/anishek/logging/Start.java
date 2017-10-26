package com.anishek.logging;
import org.apache.logging.log4j.LogManager;
public class Start {
  public static void main(String[] args) {
    LogManager.getLogger(Start.class).info("log something that will be useful.");
  }
}