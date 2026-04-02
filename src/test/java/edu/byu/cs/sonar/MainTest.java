package edu.byu.cs.sonar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MainTest {


    @Test
    void testMain() {
        String[] args = {"readMe1.txt", "readMe2.txt", "readMe3.txt", "5"};

        assertDoesNotThrow(() -> Main.main(args));

    }

  @Test
  void testMainFileNotFound() {
    String[] args = {"non_existent_file.txt", "readMe2.txt", "readMe3.txt", "1"};

    assertDoesNotThrow(() -> Main.main(args));
  }
}