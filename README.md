# Command Line Caesar Cipher

#### A Command Line Java application that implements a caesar cipher which is a type of substitution in which each letter is shifted a certain number of places also known as a key, down the alphabet(A-Z).

## Description

The Java application makes use of the caesar cipher encryption algorithm to encrypt and decrypt text input. Encryption/Decryption is done using a key(1-25) that determines which letter down/up the alphabet will replace a letter in the text input. The application also contains JUnit tests that check that the backend logic is working as expected. That is, in the development of the application TDD(Test Driven Development) has been used alongside BDD(Behavior Driven Development).


#### By **[Lynn Nyangon](https://github.com/AnnaL001)**

## Setup/Installation Requirements

- Using a mobile device/laptop ensure you have access to stable internet connection
- To access the Java application's code from your GitHub repository, you can fork the repository main's branch via the 'Fork' button.
- To access the Java application's code locally, you can clone the main branch or download the ZIP folder via the 'Code' button
- Once locally, you can view/run the Java application's code via a text editor(VS Code or Sublime Text) or an IDE(IntelliJ).

## Behavior Driven Development(BDD)
| **Behavior**                              | **Input Example**                           | **Output**                                                         |
|-------------------------------------------|:--------------------------------------------|:-------------------------------------------------------------------|
| When key provided contains text instead of digits       | key = hi    | User receives feedback advising them to use digits(1 -25) for a key    |
| When one word is provided for encryption input            | input = Hello <br> key = 1            | output = Ifmmp     |
| When multiple words are provided for encryption input          | input = Hello World <br> key = 1   | output = Ifmmp Xpsme   |
| When one word is provided for decryption input | input = Ifmmp <br> key = 1          | output = Hello |
| When multiple words are provided for decryption input            | input = Ifmmp Xpsme <br> key = 1  | output = Hello World |   
| When shift goes beyond bounds of alphabet arraylist during encryption | input = Hello <br> key = 12 | output = Tqxxa | 
| When shift goes beyond bounds of alphabet arraylist during decryption | input = Tqxxa <br> key = 12 | output = Hello |

## Dependencies

- JUnit 5 - For testing backend logic

## Technologies Used

- Java 

## Support and contact details

In case of any queries you can reach out via email; lynn.nyangon@gmail.com

### License

MIT License
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.<br>
Copyright (c) 2022 **Lynn Nyangon**
