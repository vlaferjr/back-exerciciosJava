package OrientacaoObjeto2.exceptions.senhainvalida;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        try {
            System.out.println("Digite a sua senha:");
            String senha = leitura.nextLine();

            if(senha.length() < 8) {
                System.out.println("A senha digitada foi: " + senha);
            }
            else{
                throw new SenhaInvalidaException("A senha deve possui 8 dígitos no máximo");
            }
        } catch(SenhaInvalidaException e){
            System.out.println(e.getMensagem());
        }
    }
}
