package com.anna.command_line_caesar_cipher.model;

public class Encryption {
  private String input;
  private int key;
  public Encryption(String input, int key) {
    this.input = input;
    this.key = key;
  }

  public String getInput(){
    return this.input;
  }

  public int getKey(){
    return this.key;
  }

}
