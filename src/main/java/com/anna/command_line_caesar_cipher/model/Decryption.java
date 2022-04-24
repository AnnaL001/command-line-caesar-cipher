package com.anna.command_line_caesar_cipher.model;

public class Decryption {
  private String input;
  public Decryption(String input, int key) {
    this.input = input;
  }

  public String getInput(){
    return this.input;
  }
}
