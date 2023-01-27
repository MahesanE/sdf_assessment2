package task02;

import java.io.Console;

//
public class Main {
    public static void main(String[] args) {
        Console cons = System.console();
        System.out.println("Welcome.");
        boolean exit = false;
        float ans = 0;
        float value = 0;
        float n1;
        float n2;
        while (!exit) {
            String input = cons.readLine("Enter Math Question > ");
            String[] eqn = input.trim().split(" ", 3);
            if (eqn[0].equalsIgnoreCase("exit")) {
                System.out.println("byebye");
                exit = true;
                break;
            }
            
            if (eqn[0].equalsIgnoreCase("$last")&& !(eqn[2].equalsIgnoreCase("$last"))) {
                 n1 = value;
                 n2 = Float.parseFloat(eqn[2]);

            } else if (eqn[2].equalsIgnoreCase("$last") && !(eqn[0].equalsIgnoreCase("$last"))) {
                 n2 = value;
                 n1 = Float.parseFloat(eqn[0]);
                
            } else if (eqn[0].equalsIgnoreCase("$last") && eqn[2].equalsIgnoreCase("$last")) {
                 n1 = value;
                 n2 = value;
            }
            else {
                n1 = Float.parseFloat(eqn[0]);
                n2 = Float.parseFloat(eqn[2]);

            }
            
          
               

            
            
            if (eqn[1].equals("+")) {
                ans = (n1 + n2);
                // System.out.printf("Your answer is %d\n",ans);

            } else if (eqn[1].equals("-")) {
                ans = (n1 - n2);
                // System.out.printf("Your answer is %d\n",ans);
            } else if (eqn[1].equals("*")) {
                ans = (n1 * n2);
                // System.out.printf("Your answer is %d\n",ans);
            } else {
                ans = (n1 / n2);
                // System.out.printf("Your answer is %d\n",ans);
            }
            value = ans;

            System.out.println(ans);

        

    }

}
}

