package myproject.vetor;
public class TwoSum {
    private int[] entrada;
    private int target;
    
    public TwoSum(int[] numbers, int target){
        this.entrada = numbers;
        this.target = target;
    }
    public void calcular(){
        int[] saida =  new int[2];
        int qtd=0;
        for(int i = 0;i<entrada.length;i++){
            for(int j = 1;j<entrada.length;j++){
                if(entrada[i]+entrada[j]==this.target){
                    saida[qtd++]=i;
                    saida[qtd] = j;
                }
            }
        }
        for(int i = 0;i<saida.length;i++){
            System.out.print(saida[i]+" "); 
        }
    }
}