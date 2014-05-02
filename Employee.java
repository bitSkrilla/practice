public class Employee {

        private static int nextId;
    private String name;
        private double salary;
        private String jobType;
        private int dependants;
        private int id;
        //insert hireDay date here

        public Employee(){

        }
        public String getName(){
                return Employee.name;
        }
        public double getSalary(){
                return Employee.salary;
        }
        public String getJobType(){
                return Employee.jobType;
        }
        public int getDependents(){
                return Employee.dependants;
        }
        public int getId(){
                return id;
        }
        public void setName(String name){
                this.name = name;
        }
        public void setSalary(double salary){
                this.salary = salary;
        }
