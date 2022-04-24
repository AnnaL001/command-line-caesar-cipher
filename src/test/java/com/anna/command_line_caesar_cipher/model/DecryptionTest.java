package com.anna.command_line_caesar_cipher.model;

import com.anna.command_line_caesar_cipher.model.parameter_resolver.DecryptionParameterResolver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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

  @Test
  @DisplayName("Test for retrieval of the correct value of a decryption's output")
  public void getOutput_getsInitialOutput_EmptyString(Decryption decryption) {
    assertEquals("", decryption.getOutput());
  }

  @Test
  @DisplayName("Test that Decryption class' input property is set as specified")
  public void setInput_setsDecryptionInput(Decryption decryption) {
    decryption.setInput("IJ");
    assertEquals("IJ", decryption.getInput());
  }

  @Test
  @DisplayName("Test that Decryption class' key property is set as specified")
  public void setKey_setsDecryptionKey(Decryption decryption) {
    decryption.setKey(2);
    assertEquals(2, decryption.getKey());
  }

  @Test
  @DisplayName("Test that Decryption class' output property is set as specified")
  public void setOutput_setsDecryptionOutput(Decryption decryption) {
    decryption.setOutput("HI");
    assertEquals("HI", decryption.getOutput());
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/decrypt_text.csv")
  @DisplayName("Test that Decryption is working as expected")
  public void decrypt_decodesText(int key, String encodedText, String decodedText,Decryption decryption) {
    decryption.setInput(encodedText);
    decryption.setKey(key);
    decryption.decrypt();
    assertEquals(decodedText, decryption.getOutput());
  }
}