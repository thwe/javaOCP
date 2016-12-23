
/*
 * Question 2
 */
class Boo {
Boo(String s) { }
Boo() { }
}
class Bar extends Boo {
Bar() { }
Bar(String s) {super(s);}
void zoo() {
// insert code here
	//Boo f = new Boo(24) { };
	Boo f = new Bar() { };
	//Boo f = new Boo() {String s; };
	//Bar f = new Boo(String s) { };
	//Boo f = new Boo.Bar(String s) { };
	
}
}
/*
 * Which create an anonymous inner class from within class Bar? (Choose all that apply.)
A. Boo f = new Boo(24) { };
B. Boo f = new Bar() { };
C. Boo f = new Boo() {String s; };
D. Bar f = new Boo(String s) { };
E. Boo f = new Boo.Bar(String s) { };
 */
