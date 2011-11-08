package gum.books

class Book {
	String title
	String author
	boolean published = true

	static constraints = {
		title blank: false
		author blank: false
	}
}
