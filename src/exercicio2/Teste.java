package exercicio2;

public class Teste {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario(12000, "Franciso");
        Funcionario func2 = new Funcionario(12000, "Albeto");
        Funcionario func3 = new Funcionario(12000, "Zilda");
        Funcionario[]  funcionarios = {func1, func2, func3};
        BubbleFuncionario.ordemAlfabetica(funcionarios);
        System.out.println(funcionarios[0]);
        System.out.println(funcionarios[1]);
        System.out.println(funcionarios[2]);
    }
}
