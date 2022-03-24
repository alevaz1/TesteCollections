import java.util.ArrayList;

    public class Teste {

        public static void main(String args[]) {

            List<Pessoa> lista = new ArrayList<Pessoa>();

            Pessoa a = new Pessoa("João da Silva", "Masculino");
            Pessoa b = new Pessoa("Julia Santos", "Feminino");
            Pessoa c = new Pessoa("Márcia Ferreira", "Feminino");

            lista.add(a);
            lista.add(b);
            lista.add(c);
            System.out.println(lista);


        }


    }