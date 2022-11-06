import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();

        //task2
        for(double i = 0; i <= 4;){
            double result = 3*((Math.pow(i,3) - Math.pow(i,2)) / (Math.pow(i,3) + Math.pow(i,2) + 1));
            System.out.println("x = "+i + " result: "+result);
            i = (double)Math.round((0.4 + i)*10)/10;
        }

        //task3
        System.out.print("Введіть число підкидань: ");
        String inputNumber = reader.readLine();
        System.out.println("Ви ввели: "+inputNumber );
        int count = Integer.parseInt(inputNumber);
        int dot1 = 0;
        int dot2 = 0;
        int dot3 = 0;
        int dot4 = 0;
        int dot5 = 0;
        int dot6 = 0;
        for (int i = 0;i<count;i++){
            int cube = random.nextInt(6)+1;
            if(cube==1){
                dot1++;
            } else if (cube==2) {
                dot2++;
            }else if (cube==3) {
                dot3++;
            }else if (cube==4) {
                dot4++;
            }else if (cube==5) {
                dot5++;
            }else{
                dot6++;
            }
            System.out.println("Випалo "+cube+" крапок");

        }
        System.out.println("1 Крапка випала: "+dot1 + "\n" +
                "2 Крапки випали: "+dot2+ "\n" +
                "3 Крапки випали: "+dot3+ "\n" +
                "4 Крапки випали: "+dot4+ "\n" +
                "5 Крапки випали: "+dot5+ "\n" +
                "6 Крапки випали: "+dot6);

        //task4
        System.out.print("Введіть строку: ");
        String source = reader.readLine();
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(source.charAt(i));
        }
        System.out.print("Перегонута строка: "+dest);

    }
}