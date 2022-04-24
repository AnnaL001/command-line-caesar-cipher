package com.anna.command_line_caesar_cipher.model;

public class Decryption {
  private String input;
  private int key;
  private String output;
  public Decryption(String input, int key) {
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
}
