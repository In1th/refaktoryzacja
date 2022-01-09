
/** 
 * Załóżmy, że zwykły nauczyciel może uczyć wiele studentów, ale TYLKO nauczyciele
 * dyplomowi (GraduateTeacher) mogą uczyć absolwentów (GraduateStudent).
 * 
 * Wskaż i zaproponuj rozwiązanie błędu w kodzie poniżej.
 */

class Student {
    String studentId;
    ...
}

class Teacher {
    String teacherId;
    Vector studentsTaught;

    public String getId() {
        return teacherId;
    }

    public void addStudent(Student student) {
        studentsTaught.add(student);
    }
}

class GraduateStudent extends Student {
}

class GraduateTeacher extends Teacher {
}
    