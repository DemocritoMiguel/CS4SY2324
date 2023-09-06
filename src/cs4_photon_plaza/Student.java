public class Student {
    
    String name;
    String elective;
    int age;

    
    public Student(String name, String elective, int age) {
        this.name = name;
        this.elective = elective;
        this.age = age;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Elective: " + elective);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        
        Student frankOcean = new Student("Frank Ocean", "LifeSci", 34);
        Student kendrickLamar = new Student("Kendrick Lamar", "BioStat", 40);
        Student danielCeasar = new Student("Daniel Ceasar", "LifeSci", 25);

        
        frankOcean.displayInfo();
        kendrickLamar.displayInfo();
        danielCeasar.displayInfo();

        
        int totalAge = frankOcean.age + kendrickLamar.age + danielCeasar.age;
        System.out.println("Total age: " + totalAge);

        
        boolean sameElective = frankOcean.elective.equals(danielCeasar.elective);
        System.out.println("Frank Ocean has the same Elective as Daniel Ceasar: " + sameElective);

        
        boolean sameAge = kendrickLamar.age == frankOcean.age;
        System.out.println("Kendrick Lamar is the same age as Frank Ocean: " + sameAge);
		
    }
}
