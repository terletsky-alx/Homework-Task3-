package homework3;

class Student{
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student(){
        this.firstName = "unknown";
        this.lastName = "unknown";
        this.group = "unknown";
        this.averageMark = 0.0;

    }


    public Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;

    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getGroup(){return group;}

    public double getAverageMark() {
        return averageMark;
    }

    public double getSchoolarship(){
        if(getAverageMark() == 8.0){
            return 100.0;
        }
        else return 80.0;
    }

}

class Magistracy extends Student{
    private String scientificWork;
    public Magistracy(){
        super();
        this.scientificWork = "unknown";
    }

    public Magistracy(String firstName, String lastName, String group, double averageMark, String scientificWork){
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getSchoolarship() {
        if(getAverageMark() == 8.0){
            return 200.0;
        }
        else return 180.0;
    }
}


public class StudentDemo{
    public static void main(String[] args){
        Student[] students =  new Student[4];
        students[0] = new Student();
        students[1] = new Student("Alexandr", "Terletsky", "111222", 8.5);
        students[2] = new Student("Ivanov", "Ivan", "421702", 7.9);
        students[3]= new Magistracy("Volkov", "Andrew", "678904", 9.1, "OOP in C++");

        System.out.println("-- Schoolarship --");
        for(Student s : students){
            System.out.println("First name: " + s.getFirstName() + "\nLast name: " + s.getLastName() + "\nSchoolarship: " + s.getSchoolarship());
        }



    }
}