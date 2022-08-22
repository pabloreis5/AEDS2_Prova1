import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.RandomAccessFile;

public class FuncionarioData {

    public void writeFunc(List<Funcionario> funcionarios){
        try {
            FileOutputStream fs = new FileOutputStream("dados.dat");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            for(Funcionario funcionario : funcionarios){
                os.writeObject(funcionario);
            }
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Funcionario> readFunc(int size){
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            FileInputStream fs = new FileInputStream("dados.dat");
            ObjectInputStream os = new ObjectInputStream(fs);            
            int i=0;

            while(i<size){
                Funcionario x=(Funcionario) os.readObject();
                funcionarios.add(x);
                i++;
            }
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return funcionarios;     
    }

    public int buscaSeq(int cod, int size){
        try {
            FileInputStream fs = new FileInputStream("dados.dat");
            ObjectInputStream os = new ObjectInputStream(fs);
            int i=0;
            
            while(i<size){
                Funcionario x = (Funcionario) os.readObject();
                if(cod == x.getCod()){
                    return i;
                }
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();       
        }
        return -1;
    }
    

    public int buscaBinaria(int cod, List<Funcionario> funcionarios){
        


        return -1;
    }
    
}
