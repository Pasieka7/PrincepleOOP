package ksy.javatest.OOP.Books;

public class Book extends BaseBook{

    private String topic;

    @Override
    public void open() {
        System.out.println("Book is opened");
    }

 /*   @Override
   public void close(){
        System.out.println("Book is closed");
    }*/

    public void read(){

    }
}
