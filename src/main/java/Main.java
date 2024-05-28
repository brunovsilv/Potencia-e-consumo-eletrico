
public class Main {
  public static void main(String[] args) {
    System.out.println("Uma Tv de 200 Watts fica ligada aproximada mente 5h diariamente. Determine o consumo elétrico mensal da TV.");
    System.out.println("");
    int potencia = 200;
    System.out.println("A potência e:");
    System.out.println(potencia);
    int tempo = 5;
    System.out.println("O tempo que fica ligada:");
    System.out.println(tempo);
    System.out.println("");
    System.out.println("potencia x tempo:");
    System.out.println("200 x 5 = 1000");
    System.out.println("");
    int diario = potencia * tempo;
    System.out.println("resultado diario:");
    System.out.println(diario);
    System.out.println("");
    System.out.println("resultado diario x mes:");
    System.out.println("1000 x 30 = 30000");
    System.out.println("");
    int mes = 30;
    int gastomensal = diario * mes;
    System.out.println("o gasto mensal em watts é:");
    System.out.println(gastomensal);
    System.out.println("");
    System.out.println("resultado mensal ÷ pelo resultado diario:");
    System.out.println("30000 ÷ 1000: 30");
    System.out.println("");
    int Kwh = 1000;
    System.out.println("em Kwh fica:");
    int transformando = gastomensal/Kwh;
    System.out.println(transformando);
    System.out.println("");
    System.out.println("Resultado Final: 30Kwh");
  }
}