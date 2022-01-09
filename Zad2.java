/**
 * Java udostępnia klasę "HashMap", do której można wsadzić parę klucz-wartość za
 * pomocą metody "put". Następnie możemy uzyskać wartość poprzez metodę "get", 
 * podając w argumencie klucz. Klucz i wartość mogą być dowolnego typu. Klasa ma
 * również metodę "size" zwracającą liczbę par w mapie.
 * 
 * Wskaż i usuń problem w kodzie poniżej
 */

public class CourseCatalog extends HashMap {
    
    public void addCourse(Course c) {
        put(c.getTitle(), c);
    }

    public Course findCourse(String title) {
        return (Course)get(title);
    }

    public int countCourses() {
        return size();
    }
}  