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
  public void newEncryption_instantiatesCorrectly(Encryption encryption) {
    assertNotNull(encryption);
  }

  @Test
  @DisplayName("Test for retrieval of the correct value of an encryption's input")
  public void getInput_getsEncryptionInput_Hello(Encryption encryption) {
    assertEquals("Hello", encryption.getInput());
  }
}