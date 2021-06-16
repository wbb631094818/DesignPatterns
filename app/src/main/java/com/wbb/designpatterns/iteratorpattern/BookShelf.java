package com.wbb.designpatterns.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *  书架类  储存着书的集合
 */
public class BookShelf extends Aggregate {

    private List<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
