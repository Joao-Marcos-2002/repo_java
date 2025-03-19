

public class Classroom {
    private final String className; //nome da turma (sempre a mesma)
    private final String[] students; // Lista dos alunos

    // Seta as informacoes do Construtor
    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    } 

    // Imprime as informacoes 
    public void printClassroom() {
        System.out.println("Class name: " + className); 
     
        for(String std : students) {
            System.out.println("Student: " + std);
        }

        System.out.println(); // Quebra a linha
     
    }
 
    public static void main(String[] args) {
        String[] studentsClass = {"Maria", "Joao", "Paulo"};
        Classroom cls = new Classroom("ClassB", studentsClass);
        cls.printClassroom();

    }

}



