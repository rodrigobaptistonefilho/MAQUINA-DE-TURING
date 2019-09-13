
package maquinaturing;

import java.util.Scanner;

public class MaquinaTuring {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char[] fita = new char[32];
        int qA=0, qB=0, qC=0;
        
        System.out.print("Informe a fita ");
        fita = input.nextLine().toCharArray();
        
        for(int i=0; fita[i] != '$'; i++){
            if(fita[i] == 'a'){
                qA++;
            }
            if(fita[i] == 'b'){
                qB++;
            }
            if(fita[i] == 'c'){
                qC++;
            }
        }
        
        if(qA == qB && qB == qC){
            System.out.println("Aceita!");
        }else{
            System.out.println("Recusada!");
        }
    }
}
