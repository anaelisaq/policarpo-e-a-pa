import java.util.*;
public class prova7{
    public static void main(String[] args){
        int valorPa, minPa=1, rReais;
        Scanner leitura = new Scanner (System.in);

        System.out.print("Digite o valor da pá: ");
        valorPa = leitura.nextInt();
        System.out.print("Digite a numeração da cédula em seu bolso: ");
        rReais = leitura.nextInt();
        

        while ((valorPa*minPa)%10!=0 && (valorPa*minPa)%10!=rReais) {
               minPa++;
        }
        System.out.print("O mínimo de pá: " + minPa);

    leitura.close();
}
}