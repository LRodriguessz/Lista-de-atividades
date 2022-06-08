import java.util.Scanner;
public class salario{
public static void main(String[] args){
    float despesas,salideal,aluguel,sal,trans,alim,agua,luz,gas,internet,medico,remedio;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor do aluguel:");
    aluguel = ler.nextFloat();
    System.out.println("Digite o valor do salario:");   
    sal = ler.nextFloat();
    System.out.println("Digite o valor do transporte:");
    trans = ler.nextFloat();
    System.out.println("Digite o valor da alimentação:");
    alim = ler.nextFloat();  
    System.out.println("Digite o valor da agua:");
    agua = ler.nextFloat();
    System.out.println("Digite o valor da luz:");
    luz = ler.nextFloat();
    System.out.println("Digite o valor do gas:");
    gas = ler.nextFloat();
    System.out.println("Digite o valor da internet:");
    internet = ler.nextFloat();
    System.out.println("Digite o valor do medico:");
    medico = ler.nextFloat();
    System.out.println("Digite o valor do remedio:");
    remedio = ler.nextFloat();
    salideal = sal*2;
    despesas = aluguel+trans+alim+agua+luz+gas+internet+medico+remedio;
    salideal = salideal - despesas;
    System.out.println("Sobrou pra você: R$" + salideal);

}    
}