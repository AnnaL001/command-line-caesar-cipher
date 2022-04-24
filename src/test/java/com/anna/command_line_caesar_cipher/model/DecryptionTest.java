package com.anna.command_line_caesar_cipher.model;

import com.anna.command_line_caesar_cipher.model.parameter_resolver.DecryptionParameterResolver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(DecryptionParameterResolver.class)
class DecryptionTest {
  @Test
  @DisplayName("Test for correct instantiation of Decryption class")
  public void newDecryption_instantiatesCorrectly(Decryption decryption) {
    assertNotNull(decryption);
  }

  @Test
  @DisplayName("Test for retrieval of the correct value of a decryption's input")
  public void getInput_getsDecryptionInput_IFMMP(Decryption decryption) {
    assertEquals("IFMMP", decryption.getInput());
  }

  @Test
  @DisplayName("Test for retrieval of the correct value of a decryption's key")
  public void getKey_getsDecryptionKey_1(Decryption decryption) {
    assertEquals(1, decryption.getKey());
  }
}