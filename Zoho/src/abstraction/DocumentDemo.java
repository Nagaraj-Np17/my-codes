package abstraction;
abstract class Documents{
    abstract public void print();
    abstract public void addDocs(String documents);
}
class PDFFile extends Documents{

    private String pdfDocument;
    @Override
    public void print() {
        System.out.println(pdfDocument);
    }

    @Override
    public void addDocs(String content) {
    	pdfDocument=content;
    }
}
class TextDocument extends Documents{
    private String textDocument;
    @Override
    public void print() {
        System.out.println(textDocument);
    }

    @Override
    public void addDocs(String content) {
    	textDocument=content;
    }
}
class ImageDocument extends Documents{
    private String imageDocument;
    @Override
    public void print() {
        System.out.println(imageDocument);
    }

    @Override
    public void addDocs(String content) {
        this.imageDocument=content;
    }
}
public class DocumentDemo {
public static void main(String[] args) {
	Documents documents=new PDFFile();
    documents.addDocs("To save as PDF File ");
    documents.print();

    documents=new TextDocument();
    documents.addDocs("To save as Txt documents");
    documents.print();

    documents=new ImageDocument();
    documents.addDocs("To save as Image");
    documents.print();
}
}
