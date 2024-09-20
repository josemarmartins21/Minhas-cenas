import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random cdg = new Random();
        Corrente  l[] = new Corrente[4]; 
        l[0] = new Corrente(10000, 927773901, "LANE14541252", true, "Josemar");
        
        long c = cdg.nextInt(100000000);

       /* try {
            // Tentativa de sacar um valor
            l[0].sacar(5000); // Isso vai gerar uma exceção de saldo insuficiente
            System.out.println("Saque realizado!");
        } catch (IllegalArgumentException e) {
            // Tratamento de valor inválido
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            // Tratamento de saldo insuficiente ou outros erros
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Bloco que sempre será executado
            System.out.println("Saldo atual: R$" + l[0].getSaldo());
        }
        try {
            l[0].depositar(400);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());

        }finally{

            System.out.println("Erros de limite de saldo!");
        }*/
        l[0].levantamentocs(c, 200);
        
     }
}