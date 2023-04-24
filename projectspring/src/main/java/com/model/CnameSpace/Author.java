package com.model.CnameSpace;

public class Author {
   private int Bid;
   private String BookName;
   private String AuthorName;
public Author() {
	super();

}

public Author(int bid, String bookName, String authorName) {
	super();
	Bid = bid;
	BookName = bookName;
	AuthorName = authorName;
}

public int getBid() {
	return Bid;
}
public void setBid(int bid) {
	Bid = bid;
}
public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	BookName = bookName;
}
public String getAuthorName() {
	return AuthorName;
}
public void setAuthorName(String authorName) {
	AuthorName = authorName;
}
@Override
public String toString() {
	return "Author [Bid=" + Bid + ", BookName=" + BookName + ", AuthorName=" + AuthorName + "]";
}
   
}
