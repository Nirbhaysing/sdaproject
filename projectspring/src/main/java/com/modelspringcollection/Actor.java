package com.modelspringcollection;

import java.util.Iterator;
import java.util.List;

public class Actor {
   private int id;
   private String name;
   
   private List<String> movies;
public Actor() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getMovies() {
	return movies;
}
public void setMovies(List<String> movies) {
	this.movies = movies;
}

@Override
public String toString() {
	display();
	return "";
}
public void display()
{
  System.out.println(id+" "+name);
  System.out.println("Movies List");
  
  Iterator<String>itr=movies.iterator();
  
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
}
}
