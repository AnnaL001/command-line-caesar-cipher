package com.anna.command_line_caesar_cipher.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Encryption {
  private String input;
  private int key;
  private String output;
  private static final ArrayList<Character> UPPERCASE_ALPHABET = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));
  private static final ArrayList<Character> LOWERCASE_ALPHABET = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
  public Encryption(String input, int key) {
    this.input = input;
    this.key = key;
    this.output = "";
  }

  public String getInput(){
    return this.input;
  }

  public int getKey(){
    return this.key;
  }

  public String getOutput(){
    return this.output;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  /**
   * Handle encryption of single and multiple words
   **/
  public void encrypt(){
    // Convert input to character array
    char[] inputArray = this.input.toCharArray();
    // Output string
    StringBuilder output = new StringBuilder();

    for (char character : inputArray) {
      if (Character.isUpperCase(character)) {
        encodeUppercase(output, character, this.key);
      } else if(Character.isLowerCase(character)) {
        encodeLowercase(output, character, this.key);
      } else {
        handleNonAlphabets(output, character);
      }
    }
    this.setOutput(String.valueOf(output));
  }

  /**
   * Handle encoding non alphabet characters such as punctuation and spaces
   * @param character Non alphabet character
   * @param output Encryption output's StringBuilder
   */
  private static void handleNonAlphabets(StringBuilder output, char character){
    output.append(character);
  }

  /**
   * Handle encoding of lowercase characters
   * @param output Encryption output's StringBuilder
   * @param character Plaintext character to be encoded
   * @param key Encryption key
   **/
  private static void encodeLowercase(StringBuilder output, char character, int key){
    char newCharacter;
    try {
      newCharacter = shiftWithoutException(character, key, LOWERCASE_ALPHABET);
      output.append(newCharacter);
    } catch(IndexOutOfBoundsException e){
      newCharacter = shiftWithException(character, key, LOWERCASE_ALPHABET);
      output.append(newCharacter);
    }
  }

  /**
   * Handle encoding of uppercase characters
   * @param output Encryption output's StringBuilder
   * @param character Plaintext character to be encoded
   * @param key Encryption key
   **/
  private static void encodeUppercase(StringBuilder output, char character, int key){
    char newCharacter;
    try {
      newCharacter = shiftWithoutException(character, key, UPPERCASE_ALPHABET);
      output.append(newCharacter);
    } catch(IndexOutOfBoundsException e){
      newCharacter = shiftWithException(character, key, UPPERCASE_ALPHABET);
      output.append(newCharacter);
    }
  }

  /**
   * Handle shifting characters when within array bounds
   * @param character Plain text letter to be encoded
   * @param key Encryption key
   * @param alphabets Array of alphabets; Uppercase or Lowercase
   * @return Encoded letter
   **/
  private static Character shiftWithoutException(char character, int key, ArrayList<Character> alphabets){
    int shift = alphabets.indexOf(character) + key;
    // Return replacement value
    return alphabets.get(shift);

  }

  /**
   * Handle shifting characters when beyond array bounds
   * @param character Plain text letter to be encoded
   * @param key Encryption key
   * @param alphabets Array of alphabets; Uppercase or Lowercase
   * @return Encoded letter
   **/
  private static Character shiftWithException(char character, int key, ArrayList<Character> alphabets){
    int shift = (alphabets.indexOf(character) + key) - 26;
    // Return replacement value
    return alphabets.get(shift);
  }
}

