public class book {

    String name;

    String author;

    int year;

    String edition;

    boolean inStore;



    public book(){
        this.name = "--";
        this.author = "--";
        this.year = 0;
        this.edition = "--";
        this.inStore = false;

    }

    public book(String name, String author, int year, String edition ) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.inStore = inStore;

    }
    public void loan(){ //metoder, det som ett objekt kan göra
        System.out.println(this.name + " Finns att låna ");
    }
    public void returnBook(){ //metoder, det som ett objekt kan göra
        System.out.println(this.name + " Är nu återlämnad");
    }



    @Override
    public String toString() {
        return "Name: " + this.name  +
                " Author: " + this.author +
                " Year: " + this.year +
                " Edition: " + this.edition;
    }
}
