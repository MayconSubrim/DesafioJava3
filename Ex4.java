public class Ex4{
    public static void main(String[] args){
        double acum = 0;
        for(int i = 0; i <= 100; i++){
            if(i >= 15 ){
                acum += i;
            }
        }
        System.out.println("o resultado é: " + (acum / 85));
    }
}