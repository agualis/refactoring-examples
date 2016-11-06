package com.agualis.refactoring.telldontask;

class VortexManager {

  private final Alarm alarm;

  public VortexManager(Alarm alarm) {
    this.alarm = alarm;
  }

  public void setLevel(String name, int value) {
    AskMonitor am = new AskMonitor(name, 2, alarm);
    am.setValue(value);
    if (am.getValue() > am.getLimit())
      am.getAlarm().warn(am.getName() + " too high");
  }
}
