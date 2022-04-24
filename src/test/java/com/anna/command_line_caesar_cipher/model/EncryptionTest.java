package com.anna.command_line_caesar_cipher.model;

import com.anna.command_line_caesar_cipher.model.parameter_resolver.EncryptionParameterResolver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import javax.management.ConstructorParameters;

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
  public void getInput_getsEncryptionInput_HELLO(Encryption encryption) {
    assertEquals("HELLO", encryption.getInput());
  }

  @Test
  @DisplayName("Test for retrieval of the correct value of an encryption's key")
  public void getKey_getsEncryptionKey_1(Encryption encryption) {
    assertEquals(1, encryption.getKey());
  }

  @Test
  @DisplayName("Test for retrieval of the correct value of an encryption's output")
  public void getOutput_getsInitialEncryptionOutput_EmptyString(Encryption encryption) {
    assertEquals("", encryption.getOutput());
  }

  @Test
  @DisplayName("Test that Encryption's input property is set as specified")
  public void setInput_setsEncryptionInput(Encryption encryption) {
    encryption.setInput("HI");
    assertEquals("HI", encryption.getInput());
  }

  @Test
  @DisplayName("Test that Encryption's key property is set as specified")
  public void setKey_setsEncryptionKey(Encryption encryption) {
    encryption.setKey(2);
    assertEquals(2, encryption.getKey());
  }

  @Test
  @DisplayName("Test that Encryption's output property is set as specified")
  public void setOutput_setsEncryptionOutput(Encryption encryption) {
    encryption.setOutput("IFMMP");
    assertEquals("IFMMP", encryption.getOutput());
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/encrypt_text.csv")
  @DisplayName("Test that Encryption is working as expected")
  public void encrypt_encodesText(int key, String plainText, String encodedText,Encryption encryption) {
    encryption.setInput(plainText);
    encryption.setKey(key);
    encryption.encrypt();
    assertEquals(encodedText, encryption.getOutput());
  }
}