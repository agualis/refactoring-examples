package com.agualis.refactoring.telldontask;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;


public class TestTellDontAsk {

  @Mock Alarm alarm;

  @Before
  public void init() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void
  testAlarmWarnsWhenLimitHigh() {
    new VortexManager(alarm).setLevel("Corruption Level", 3);

    verify(alarm).warn(anyString());
  }

}