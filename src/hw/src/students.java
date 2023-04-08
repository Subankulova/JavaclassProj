package hw.src;

public class students {
    String name,speciality; int age;

    students(String name, int age, String speciality){
        this.name = name;
        this.speciality =  speciality;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getSpeciality(){
        return speciality;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return ("Hi my name is " + this.getName() + ", my age is " + this.getAge() + ", and speciality is "  + this.getSpeciality());
    }
}
