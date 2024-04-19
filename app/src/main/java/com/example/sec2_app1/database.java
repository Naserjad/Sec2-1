package com.example.sec2_app1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class database {
    private ArrayList<Book>books=new ArrayList<>();
    public database(){
books.add(new Book("Proffessional android development","John","Programming"));
        books.add(new Book("Database Systems","Elmasri","Database"));
        books.add(new Book("Beginning python","Mark","Programming"));
        books.add(new Book("html5","Mark","Web"));

    }

    public List<Book> getBooks(String cat) {

        ArrayList<Book> result = new ArrayList<>();
        for(Book b:books){
            if(b.getCategory().equals(cat)) {
                result.add(b);
            }
        }
        return result;
    }

}

