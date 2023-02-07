package io.github.aaronchenwei;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class SpeakerTest {

  @Test
  public void speak() {
    assertNotNull("He really speaks", new Speaker().speak());
  }
}
