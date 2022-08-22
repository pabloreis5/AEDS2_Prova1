import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        FuncionarioData data = new FuncionarioData();
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();

        /* DEFININDO NUMERO DE FUNCIONARIOS */
        System.out.println("Quantidade de funcionarios: ");
        int size = Integer.parseInt(ler.nextLine());


        /* SETANDO FUNCIONARIOS E SALVANDO EM UM ARRAYLIST */
        System.out.println("* SALVANDO FUNCIONARIOS...  \n");        
        for(int i=0; i<size; i++){            
            int cod = gerador.nextInt(1000);
            String nome = "Funcionario " + i;
            String cpf = "111.111.111";
            String data_nasc = "01/01/2000";
            double salario =  1000+i;

            funcionarios.add(new Funcionario(cod, nome, cpf, data_nasc, salario));
        }

        /* SALVANDO ARRAYLIST EM ARQUIVO BINARIO */
        data.writeFunc(funcionarios);

        /* LENDO ARRAYLIST DO ARQUIVO BINARIO */
        System.out.println("* LENDO FUNCIONARIOS...  \n");        
        funcionarios = data.readFunc(size);

        /* IMPRIMINDO INFORMAÇÕES DE CADA USUARIO */
        for(int i=0; i<size; i++){
            System.out.println(funcionarios.get(i));
        } 


        /* BUSCA SEQUENCIAL */
        System.out.println("* BUSCA SEQUENCIAL...  \n");
        System.out.println("Qual Codigo Buscar: ");
        int cod = Integer.parseInt(ler.nextLine());
        int pos = data.buscaSeq(cod,size);

        if(pos>=0){
            System.out.print("\t\t## Numero de Comparação: "+pos+" ##\n"+funcionarios.get(pos));
        }else{
            System.out.println("# NAO ENCONTRADO \n# NUMERO DE COMPARAÇÃO: "+size);
        }

        /* ORDENAÇÃO DO ARQUIVO (KEYSORTING) */

        /* BUSCA BINARIA */





       

        

        
        
    


        

    }

}
