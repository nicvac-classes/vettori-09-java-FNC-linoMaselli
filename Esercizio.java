import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        
        int n, i, tempoL, tempoV, minL, minV, iminL, iminV, imin;

        System.out.println("quanti giri hanno fatto durante la gara?");
        n = in.nextInt();
        int[] l = new int[n];
        int[] v = new int[n];

        for (i = 0; i < n; i++) {
            l[i] = 60 + random.nextInt(181);
            System.out.println("Lecler " + (i + 1) + "° giro in " + l[i] + "s");
            v[i] = 60 + random.nextInt(181);
            System.out.println("Verstappen " + (i + 1) + "° giro in " + v[i] + "s");
        }
        tempoL = 0;
        tempoV = 0;
        for (i = 0; i < n; i++) {
            tempoL += l[i];
            tempoV += v[i];
        }
        minL = Integer.MAX_VALUE;
        minV = Integer.MAX_VALUE;
        iminL = 0;
        iminV = 0;
        for (i = 0; i < n; i++) {
            if (l[i] < minL) {
                minL = l[i];
                iminL = i;
            }
            if (v[i] < minV) {
                minV = v[i];
                iminV = i;
            }
        }
        imin = (l[iminL] < v[iminV]) ? iminL : iminV;
        if (minL < minV) {
            System.out.println("Lecler ha eseguito il giro più veloce con tempo " + minL + " al giro " + imin);
        } else {
            System.out.println("Verstappen ha eseguito il giro più veloce con tempo " + minV + " al giro " + imin);
        }
        if (tempoL < tempoV) {
            System.out.println("il vincitore è Leclerc!");
        } else {
            System.out.println("il vincitore è Verstappen!");
        }
    }
}

