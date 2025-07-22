public class Numero {
    public static void dividir(int a, int b){
        int resultado = 0;
        try{
            resultado = a / b;
        }catch(Exception e){
            System.out.printf("Nao eh possivel dividir por zero\n");
        }finally{
            System.out.printf("%d / %d = %d\n", a, b, resultado);
        }
    }
}
