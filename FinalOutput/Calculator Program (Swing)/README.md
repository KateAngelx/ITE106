### Explanation of the Calculator Application
This Calculator application is a simple GUI-based program written in Java that performs basic arithmetic operations such as addition, subtraction, multiplication, and division. The user can interact with the application via a graphical interface built with Java's Swing framework. The results of calculations are displayed on the screen, and a history of calculations is saved in a file named `calculator_history.txt`.

### Key Features:
1. **Basic Arithmetic Operations:**
   - Perform calculations for addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`).
2. **Clear Function (`C`):**
   - Clears the display and resets any previous input or result.
3. **Percent Function (`%`):**
   - Converts the displayed number into its percentage form.
4. **Calculation History:**
   - Each calculation (when `=` is pressed) is saved in a text file (`calculator_history.txt`) in the format: `num1 operator num2 = result`.
5. **Error Handling:**
   - The program displays "Error" if an invalid operation (e.g., dividing by zero) is attempted.

### How to Compile and Run the Application:
1. Open Command Prompt (Windows) or Terminal (Mac/Linux) and navigate to the directory where the `Calculator.java` file is saved:
  C:\path\to\your\file
2. Compile the Java file:
   javac Calculator.java
3. Run the compiled Java application:
   java Calculator

### Notes:
- Ensure that the `calculator_history.txt` file is in the same directory as the Java file. The program will create and modify this file when performing calculations.
- The history file stores calculations in the format: `num1 operator num2 = result`. This allows users to review past operations.
