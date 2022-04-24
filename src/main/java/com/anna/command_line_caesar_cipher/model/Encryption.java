package com.anna.command_line_caesar_cipher.model;

public class Encryption {
  private String input;
  private int key;
  private String output;
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

}
