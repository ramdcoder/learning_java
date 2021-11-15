class Student {

    int id = 100;
    byte age = 18; //tipo byte --> integer de menor tamanho na memória. [-128, 127]
    short rank = 165; //tipo short --> permite atribuiçãode valores maiores que byte.
    int phone = 234567890; //tipo int --> permite atribuição de valores maiores que short.
    long cpf = 223_456_789_10L; //tipo long permite atribuição de valores maiores que int. Podemos utilizar _ para deixar o número mais legível. Os _ devem aparecer entre os números, não no início ou no fim.

    // Integer literals: int literal, long literal

    // Apesar de existir todos esses tipos para integers, recomenda-se utilizar sempre int. A não ser que o número seja muito grande (utilizar long) ou se poupar memória for realmente importante.

    float gradeAverage = 3.8f; // o 'f' é obrigatório para floats. Se não incluir, o número é um  double literal.
    double score = 9.76; // para doubles não precisa incluir o 'd' no final do double literal. Mas pode ser incluído.
    double scientific = 976e-2; // É possível se utilizar notação científica em double literals.

    // Recomenda-se utilizar sempre double.
    // Os números em double ou float não são exatos em nenhuma linguagem de programação. Se a aplicação envolver dinheiro, recomenda-se utilizar a classe BigDecimal do pacote math de Java.

    char test = '\u01BA'; //Java utiliza o encoding scheme UTF-16 para caracteres UNICODE

    boolean international = true; //o default é false. Se apenas declarar a variável, vai ser false.
    double tuitionFees = 12_000.0;
    double internationalAdditionalFee = 5_000.0;

    void computeTuition() {
        if (international) {
            tuitionFees = tuitionFees + internationalAdditionalFee;
        }
    }

    void computeNextId() {
        int nextId = id + 1;

        System.out.println("id: " + id);
        System.out.println("Next id: " + nextId);
    }

    void presentStudentData() {

        System.out.println("Student of age: " + age);
        System.out.println("Student rank: " + rank);
        System.out.println("Student phone: " + phone);
        System.out.println("Student CPF: " + cpf);
        System.out.println("Grades' General Average: " + gradeAverage);
        System.out.println("Score example: " + score);
        System.out.println("Scientific notation example: " + scientific);
        System.out.println("Test of UTF-16 code: " + test);
        System.out.println("Tuition fees for the student: $" + tuitionFees);

    }

    public static void main(String[] args) {

        Student student = new Student();
        student.computeNextId();
        student.presentStudentData();

    }

}
