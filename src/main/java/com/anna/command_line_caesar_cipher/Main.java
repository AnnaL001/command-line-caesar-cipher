package com.anna.command_line_caesar_cipher;

import com.anna.command_line_caesar_cipher.model.Decryption;
import com.anna.command_line_caesar_cipher.model.Encryption;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  private static final String ENCRYPTION = "E";
  private static final String DECRYPTION = "D";
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    displayWelcomeMessage();
    HashMap<String, Object> operationsInput = gatherOperationsInput();
    System.out.println("----------------------------------------OUTPUT-----------------------------------------------");
    performOperations(operationsInput.get("selection").toString(), operationsInput.get("inputText").toString(), (int) operationsInput.get("key"));
  }

  private static void performOperations(String selection, String inputText, int key){
    switch (selection) {
      case ENCRYPTION -> {
        Encryption encryption = new Encryption(inputText, key);
        encryption.encrypt();
        System.out.println("Plain text: " + encryption.getInput() + "\nKey: " + encryption.getKey() + "\nEncrypted text: " + encryption.getOutput());
      }
      case DECRYPTION -> {
        Decryption decryption = new Decryption(inputText, key);
        decryption.decrypt();
        System.out.println("Encrypted text: " + decryption.getInput() + "\nKey: " + decryption.getKey() + "\nPlain text: " + decryption.getOutput());
      }
      default -> System.out.println("Only two operations allowed; E for encryption & D for Decryption");
    }
  }

 private static HashMap<String, Object> gatherOperationsInput(){
    HashMap<String, Object> operationsInput = new HashMap<>();
    System.out.println("To encrypt text enter 'E', To decrypt text enter 'D': ");
    String selection = gatherStringInput();
    System.out.println("Enter plaintext to be encrypted/decrypted: ");
    String inputText = gatherStringInput();
    System.out.println("Enter key(1-25) that you would like to encrypt/decrypt text with: ");
    int key = gatherNumberInput();

    // Populate hashmap
    operationsInput.put("selection", selection);
    operationsInput.put("inputText", inputText);
    operationsInput.put("key", key);
    return operationsInput;
 }

  private static String gatherStringInput(){
    return scanner.nextLine();
  }

  private static int gatherNumberInput(){
    int numberInput = 0;
    try {
      numberInput = scanner.nextInt();
    } catch (InputMismatchException e){
      System.out.println("The key should only contain digits ranging from 1 - 25");
    }
    return numberInput;
  }

  private static void displayWelcomeMessage(){
    System.out.println("===========================================================================================");
    System.out.println("COMMAND LINE CAESAR CIPHER");
    System.out.println("===========================================================================================");
    System.out.println("""
        Welcome to the command line caesar cipher that performs encryption and decryption of text\s
        NB: Punctuation, spaces and digits are not encrypted/decrypted\s
        List of operations:\s
        E - Encryption
        D - Decryption\s""");
    System.out.println("----------------------------------------INPUTS-----------------------------------------------");
  }
}