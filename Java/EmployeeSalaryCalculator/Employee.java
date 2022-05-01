public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;

    Employee(String name,double salary,int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.tax=0;
        this.bonus=0;
        this.raiseSalary=0;
    }

    double tax(){
        if(this.salary > 1000){
            this.tax=this.salary*0.03;
        } else {
            return this.tax=0;
        }
        return this.tax;
    }

    double bonus(){
        if(this.workHours >40){
            this.bonus=(this.workHours-40)*30;
        } else {
            this.bonus=0;
        }
        return this.bonus;
    }

    double raiseSalary(){
        if(2021-this.hireYear<10){
            this.raiseSalary=this.salary*0.05;
        }
        else if(2021-this.hireYear >9 && 2021-this.hireYear <20){
            this.raiseSalary=this.salary*0.10;
        }
        else {
            this.raiseSalary=this.salary*0.15;
        }
        return this.raiseSalary;
    }

    void employeeInfo(){
        System.out.println("*****Employee Info*****");
        System.out.println("Adı : "+ this.name);
        System.out.println("Salary : "+ this.salary);
        System.out.println("Working Hours : "+ this.workHours);
        System.out.println("Hire Year : "+ this.hireYear);
        System.out.println("Tax : "+ tax());
        System.out.println("Salary Bonus : "+ bonus());
        System.out.println("Salary Raise : "+ raiseSalary());
        System.out.println("Net Salary with Bonus : "+ (this.salary-tax()+bonus()) );
        System.out.println("Total Salary : "+ (this.salary+raiseSalary()));
    }

}
