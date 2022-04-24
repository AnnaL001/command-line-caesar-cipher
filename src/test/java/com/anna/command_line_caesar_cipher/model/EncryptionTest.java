package com.anna.command_line_caesar_cipher.model;

import com.anna.command_line_caesar_cipher.model.parameter_resolver.EncryptionParameterResolver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(EncryptionParameterResolver.class)
class EncryptionTest {
  @Test
  @DisplayName("Test for correct instantiation of Encryption class")
  public void newEncryption_instantiatesCorrectly() {
    Encryption encryption = new Encryption("Hello", 1);
    assertTrue(encryption instanceof Encryption);
  }
}