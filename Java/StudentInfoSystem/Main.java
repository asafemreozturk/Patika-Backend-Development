public class Main {
    public static void main(String[] args) {
        Course mat= new Course("Matematik","MAT1001","MAT");
        Course fizik=new Course("Fizik","FZK1001","FZK");
        Course kimya=new Course("Kimya","KMY1001","KMY");

        Teacher t1=new Teacher("Ahmet Hoca","12121","MAT");
        Teacher t2=new Teacher("Fatma Hoca","12122","FZK");
        Teacher t3=new Teacher("Mehmet Hoca","12123","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 =new Student("Ahmet",4,"21",mat,fizik,kimya);
        s1.addBulkExamNote(50,20,40,50,60,70);
        s1.isPass();

        Student s2 =new Student("Mehmet",4,"22",mat,fizik,kimya);
        s2.addBulkExamNote(100,30,40,60,75,75);
        s2.isPass();

        Student s3 =new Student("İsmail",5,"23",mat,fizik,kimya);
        s3.addBulkExamNote(65,40,50,80,65,70);
        s3.isPass();
    }
}



