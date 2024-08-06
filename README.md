# Password Generator

## Overview
This Java program generates a random password of a length determined by the PasswordGenerator class. The password length is randomly set between 8 and 16 characters if not specified, and it includes a mix of uppercase letters, lowercase letters, numbers, and special characters.

## Files
The program consists of two main classes:

-Main: The entry point of the application.
-PasswordGenerator: A class responsible for generating random passwords.

## Requirements
-Java Development Kit (JDK) 8 or higher

## Notes
Each run will generate a different password due to the randomness.

The default constructor of PasswordGenerator sets the password length to a random value between 8 and 16 characters. This range can be adjusted if needed.
The character set used for generating the password includes uppercase letters, lowercase letters, digits, and special characters. This set can be customized by modifying the CHARACTERS constant in the PasswordGenerator class.
