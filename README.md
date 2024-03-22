Without modifying the main method, make the code below work.
Hint: Subject class can have access to students’ set (e.g. an array). Adding too many
students to the set may throw an exception.
public class Main {
public static void main ( String args []) {
Person p1 = new Person ("Jan ", 50) ;
Student s1 = new Student (" Jasiek ", 20) ;
Person p3 = ( Person ) s1 ;
p1 . sayHelloTo ( p3 ) ; // Hi Jasiek !
p3 . sayHelloTo ( p1 ) ; // Hi Jan !
Subject s = new Subject ("GUI ") ;
s . setTeacher ( p1 ) ;
try {
s . addStudent ( s1 ) ;
} catch ( TooManyStudentsException e ) {
e . printStackTrace () ;
}
System . out . println ( s ) ; // GUI , teacher : Jan , students : Jasiek
}
}
