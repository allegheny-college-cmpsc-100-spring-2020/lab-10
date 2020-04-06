package labten;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/* TODO Import library for ArrayList */
import java.util.Iterator;
import java.util.Scanner;

/** Displays G. Wiz's new library.
 *
 * @author {Your Name Here}
 */
public class DisplayLibrary {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Set up reading from file
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/book.list");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    /*
     * TODO Set up identifiers for use in loop:
     *      integer     to track the "column" we're on
     *      Book        to use methods to create a Book from the data
     *      Scanner     to scan the line of data read from the file
     *      ArrayList   to hold all of the book objects
     */
    
    /*
     * TODO Write loop to:
     *      - Iterate over file, reading line by line
     *      - Scanning each line using a \t (tab) delimiter
     *      - Use proper methods of Book to set author, title, page count
     *        - Can use either a switch or an if statement
     *      - Add book to ArrayList object
     */
    
    /* 
     * TODO Create identifiers for second loop:
     *      - variable of double type to keep track of total width of books
     */
    
    System.out.println("This library contains " + /* TODO Print size of ArrayList */ + " books.");
    System.out.println();
    
    /*
     * TODO Iterate over library object while number of books read is less than ArrayList size
     *      - Add each book's width to the double keeping track of width of books
     *      - Be sure to increment the index variable to avoid infinite loop
     */
    
    // Print results
    
    DecimalFormat fmt = new DecimalFormat("#.##");
    System.out.println("It takes up " + fmt.format(/* TODO Insert identifier for total width, convert to feet */) 
                       + " linear feet of shelf space.");
    
  }
}