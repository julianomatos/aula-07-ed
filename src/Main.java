//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] vetorBubble = {59, 22, 100, 2, 35, 49};
        int[] vetorSelection= {19, 312, 111, 2, 39, 49, 44, 1};
        int[] vetorInsertion = {19, 11, 45, 39, 49, 99, 1, 3};

        Ordenacao.bubbleSort(vetorBubble);
        Ordenacao.imprimeVetor(vetorBubble);
       // Ordenacao.selectionSort(vetorSelection);
       // Ordenacao.imprimeVetor(vetorSelection);
      //  Ordenacao.insertionSort(vetorInsertion);
//Ordenacao.imprimeVetor(vetorInsertion);
    }
}