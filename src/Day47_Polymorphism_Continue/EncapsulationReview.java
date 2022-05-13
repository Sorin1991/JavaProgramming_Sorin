package Day47_Polymorphism_Continue;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    public EncapsulationReview(String bookTitle, String publishDate) {
        setBookTitle(bookTitle);
        this.publishDate = publishDate;
    }

    public String getBookTitle() {
        if(bookTitle== null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
