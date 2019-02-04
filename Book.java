/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (andrew riganati
 * @version 2/4/2019
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private Boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, 
     String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
       
    }

    // Add the methods here ...
    public String getAuthor()   
    { 
        return author;
    }
    
    public String getTitle()
    {
        return title;

    }
    
    public int getPages()
    {
        return pages;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void borrow()
    {
        borrowed += 1;
    }
    
    /** 
     * print the author
     */
    public void printAuthor(String author)
    {
        System.out.println("author: " + author);
    }
    
    /**
     * print the title
     */
    public void printTitle(String author)
    {
        System.out.println("title: " + title);
    }
    
    /**
     * Print a detailed description of the book, including title, author, 
     * and page count.
     */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Checked out?: " + borrowed);
        /**
         * would only work if a function to record books being checked out
         * was programmed.
        *if(borrowed() > 0)
        *{
        *    System.out.println("This book is currently checked out!")
        *}
        */
        if(refNumber.length() > 0)
        {
            System.out.println("Reference Number: " + refNumber);
        }
        else{
            System.out.println("Reference Number: N/A");
        }
    }
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3){
         refNumber = ref;
        }
        else{
        System.out.println("Not a valid reference number!");
        System.out.println("Valid reference numbers must be");
        System.out.println("at least three characters long");
        }
    }
    
    /**
     * Returns reference number as refNumber.
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
}


 
