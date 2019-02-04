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
    private Integer pages;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, Integer bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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
}
 
