### Explanation of the Application
This Phonebook System is a simple GUI-based application in Java that allows users to manage contacts. Users can add, delete, search, and update contacts, with data stored in a file named `phonebook.txt`. The application uses **Swing** for the graphical user interface and **BufferedReader/Writer** for reading and writing contact data.

**Key Features:**
- **Add Contact:** _Adds a new contact (name and phone number) to the phonebook._
- **Delete Contact:** _Deletes a contact by name._
- **Search Contact:** _Searches for a contact by name and displays it in a dialog box._
- **Update Contact:** _Allows updating a contact’s phone number._

### How to Compile and Run the Application:

Open Command Prompt and navigate to the file location:
cd C:\path\to\your\file

Compile the Java file:
javac PhonebookSystem.java

Run the compiled Java application:
java PhonebookSystem

#### Notes:
- Make sure that the **phonebook.txt** file exists in the same directory as your Java file. The application will create and modify this file when contacts are added, updated, or deleted.
- The phonebook.txt file stores contacts in a simple format: `name,phoneNumber`.
