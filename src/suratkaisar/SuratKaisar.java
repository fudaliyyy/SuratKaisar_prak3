/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suratkaisar;

/**
 *
 * @author Zephyrus
 */
public class SuratKaisar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String alfabet = sc.nextLine();
        int pergeseran = sc.nextInt();
        int panjang = alfabet.length();
        System.out.print(pergeseran(pergeseran,alfabet,panjang));
      }
    
    static String pergeseran(int pergeseran, String alfabet,int panjang){
        String jadi = "";  
        for(int a = 0;a<panjang;a++){
       
          int x = alfabet.charAt(a);
          if(x == 32){
          jadi = jadi+" ";
          } else if (x >=65 && x<=90){
            x = x+pergeseran;
            if(x>90){
              x-=26;
              jadi = jadi+(char)x;
          }else{
              jadi = jadi+(char)x;
            }
              
          } else if(x>=97&&x<=122){
            x = x+pergeseran;
            if(x>122){
              x -=26;
              jadi = jadi+(char)x;
            }else{
              jadi = jadi+(char)x;
            }
          } 
        }
        
        return jadi;
        }
    }
