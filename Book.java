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
    
    public Integer getPages()
    {
        return pages;
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
    }
    
    public void setRefNumber(String ref)
    {
        ReferenceNumber = refNumber;
    }
}

 
