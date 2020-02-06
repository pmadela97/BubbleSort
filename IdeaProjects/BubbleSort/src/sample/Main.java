package sample;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int tab[] = {4,5,6,3,2};
        int n = tab.length;

        for(int h = 0; h < n; h++){
            System.out.print(tab[h]);
        }
        System.out.println();
        for(int i =0; i<n-1;i++) {
            for (int j = 0; j < n - i -1; j++) {

                if(tab[j]>tab[j+1]){
                    int bufor = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = bufor;
                }
            }
            for(int h = 0; h < n; h++){
                System.out.print(tab[h]);
            }
            System.out.println();
        }

        for(int h = 0; h < n; h++){
            System.out.print(tab[h]);
        }
        System.out.println();
        System.out.println();

        int tab2[] = {4,5,6,3,2};

        for(int i = n-2;i >0;i--) {
            for (int j = n-i-2; j >0; j--) {

                if(tab2[j]>tab2[j-1]){
                    int bufor = tab2[j-1];
                    tab2[j-1] = tab2[j];
                    tab2[j] = bufor;
                }
            }
            for(int h = 0; h < n; h++){
                System.out.print(tab2[h]);
            }
            System.out.println();
        }

    }


}
