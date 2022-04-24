package com.anna.command_line_caesar_cipher.model;

public class Encryption {
  private String input;
  public Encryption(String input, int key) {
    this.input = input;
  }

  public String getInput(){
    return this.input;
  }

}
