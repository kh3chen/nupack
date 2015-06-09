import java.util.Scanner;

public class NuPack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1, line2, line3;
        
        line1 = sc.nextLine();
        line2 = sc.nextLine();
        line3 = sc.nextLine();
        
        NuPackCalculator npc = new NuPackCalculator();
        System.out.println(npc.calculate(line1, line2, line3));
    }
}