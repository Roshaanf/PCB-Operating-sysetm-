/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcb;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Roshaann 2.7 gpa
 */
public class PCB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        
       Random r=new Random();  
        int[] a=new int[r.nextInt(6)+4];
        int[] a1=new int[r.nextInt(5)+5];
        int[] a2=new int[r.nextInt(5)+5];
        int[] ins=new int[4];
        boolean[] b=new boolean[4];
        int[] len=new int[4];
        int [] flag=new int[4];
        flag[1]=flag[2]=flag[3]=0;
        len[1]=a.length;
        len[2]=a1.length;
        len[3]=a2.length;
        b[1]=b[2]=b[3]=true;
        ins[1]=ins[2]=ins[3]=1;
        int i=0;
        int temp;
        int j=0;
        int bit = 3;
      int f=0;
        int inr=(1+r.nextInt(3));
        if(inr==1){
            inr=2;
        }
        //System.out.println("          "+inr);
      //  System.out.println("a a1 a2"+a.length+a1.length+a2.length);
     while(i<=a.length||i<=a1.length||i<=a2.length) {  
         
     if(i<a.length){
        // System.out.println("nn1");
         a[i]=r.nextInt(15)+1;
       }
     if(i<a1.length){
        // System.out.println("nn2");
           a1[i]=r.nextInt(15)+1;
       }
     if(i<a2.length){
         //System.out.println("nn3");
           a2[i]=r.nextInt(15)+1;
       } i++;}
      
     
     i=1;
    
  
    while(b[1]==true||b[2]==true||b[3]==true){
        
        
        while(1==1){
            
          if(i==1&&ins[1]==bit){
              bit=0;
              System.out.println(" PROCESS a1 NEEDS AN I/O");
              System.out.println("PROCESS a1 STATE = SUSPENDED");
              System.out.println("");
              
              f=1;
              break;
          } 
            
            if(b[i]==false){
                break;
            }
           
            else{
                
                if((f==1)&&(i==inr)&&((j%9==0)||(j%7==0))){
                    f=0;
                    System.out.println("INTERRUPT INTERRUPT");
                System.out.println("Process id =a"+i);   
                   // System.out.println("Process State = Blocked");
                    System.out.println("Flag bit = 1");
                    System.out.println("Resume instruction ="+ins[i]);
                    System.out.println("count of remaining instructions = "+(len[i]-ins[i]));
                    System.out.println("");
                    System.out.println("PROCESS a1 EVENT OCCURED");
                    System.out.println("");
                }
                else{
            System.out.println("Process id =a"+i);        
            System.out.println("Process State = Running");
            System.out.println("scheduling algorithm = Round Robin");
            System.out.println("quantum size = 2");
            System.out.println("Execution time = "+(len[i]-1)+"quantum");
            System.out.println("Total no of instructions = "+(len[i]-1));
            System.out.println("Instruction register = "+ins[i]);
          
            temp=i;
            //for pc value
            while(1==1){
             //whenever index become 3 0 say uthayega usay takay out of bound na ho
             if(f==1&&i==3){
                 System.out.println("pc = a"+(i-1)+"["+(ins[2])+"]");
                 break;
             }  
            else if(temp==3){
                   temp=0;
                   }   
           //ye loop ko terminate krega
              else if(b[temp+1]==true){
                   //program k end me
                   if((temp+1)==i&&len[i]==(ins[i]+1)){
                       System.out.println("program counter =no process");
                       break;
                   }// hr iteration me
                   if(temp+1==i){
                       temp=temp+1;
                       System.out.println("pc = a"+temp+"["+(ins[temp]+1)+"]");
                       break;
                   }
                   else{
                   temp=temp+1;
                   System.out.println("Pc a"+temp+"["+ins[temp]+"]");
                  break;}
               }
               
              else {
                   temp++;
               }
                       
            
            
            }
        
        //jo khtm hty jaengy unhy false krdega
          if(len[i]==(ins[i]+1)&&b[i]==true){
            b[i]=false;
            j++;
            
            if(b[1]==false&&b[2]==false&&b[3]==false){
              System.out.println("Resume quantum no = all process completed");}
            
            else{ 
            System.out.println("Resume quantum no = "+(j+1));}
            
              System.out.println("Resume instruction number = process completed");
              System.out.println("");
            break;
            }
          
          else{
              System.out.println("Resume quantum no= "+(j+2));
              System.out.println("Resume instruction no= "+(ins[i]+1));
          ins[i]++;
          } System.out.println(""); 
          j++;
           
          //ye main loop ki condition
          if(j%2==0){
                break;
            }
                }} 
        } 
        
        if(i==3){
            i=0;
        }
        
        i++;
    }
    
    
    
    
    }
    
}
