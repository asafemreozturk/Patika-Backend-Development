public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, int classes,String stuNo, Course mat, Course fizik,Course kimya){
        this.name=name;
        this.classes=classes;
        this.stuNo=stuNo;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        calcAverage();
        this.isPass=false;

    }

    public void addBulkExamNote(int matexamNote, int fizikexamNote, int kimyaexamNote,int fizikPerfNote, int kimyaPerfNote, int matPerfNote){
        if(matexamNote >= 0 && matexamNote <=100 &&  matPerfNote >= 0 && matPerfNote <=100){
            this.mat.examNote=matexamNote;
            this.mat.perfNote= matPerfNote;
        }

        if(fizikexamNote >= 0 && fizikexamNote <=100 && fizikPerfNote >= 0 && fizikPerfNote <=100 ){
            this.fizik.examNote=fizikexamNote;
            this.fizik.perfNote=fizikPerfNote;
        }

        if(kimyaexamNote >= 0 && kimyaexamNote <=100 && kimyaPerfNote>=0 && kimyaPerfNote <=100 ){
            this.kimya.examNote=kimyaexamNote;
            this.kimya.perfNote=kimyaPerfNote;
        }

    }

    public void isPass(){
        if(this.mat.examNote==0 || this.fizik.examNote==0 || this.kimya.examNote==0){
            System.out.println("Notlar tam olarak girilmemiş");
        }
        else {
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Ortalama : "+this.average);
            if(this.isPass){
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldın.");
            }
        }
    }


    public void calcAverage(){
        this.average=( ((this.fizik.examNote*0.8)+(this.fizik.perfNote*0.2))+
                ((this.mat.examNote*0.8)+ (this.mat.perfNote+0.2))+
                ((this.kimya.examNote*0.8)+ (this.kimya.perfNote+0.2)) ) / 3;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average >55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : "+this.name);
        System.out.println("Matematik Sınav Notu : "+ this.mat.examNote + "| Matematik Performans Notu : "+ this.mat.perfNote );
        System.out.println("Fizik Sınav Notu : "+ this.fizik.examNote + "| Fizik Performans Notu : "+ this.fizik.perfNote );
        System.out.println("Kimya Sınav Notu : "+ this.kimya.examNote + "| Kimya Performans Notu : "+ this.kimya.perfNote );
    }

}
