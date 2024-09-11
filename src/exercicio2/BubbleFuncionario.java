package exercicio2;

public class BubbleFuncionario {

    public static void ordemAlfabetica(Funcionario[] funcionarios){
        int n = funcionarios.length;
        for (int i = 0; i < n - 1; i++){
            for(int j = 0; j < n -i - 1; j++){
                if (funcionarios[j].getNome().compareTo(funcionarios[j+1].getNome()) > 0){
                    Funcionario aux = funcionarios[j];
                    funcionarios[j] = funcionarios[j +1];
                    funcionarios[j + 1] = aux;
                }
            }
        }
    }
}
