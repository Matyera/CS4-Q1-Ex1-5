/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author TAU
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1="One Piece";
    int e1=1073;
    double i1=8.9;
    String n2="Berserk (1997)";
    int e2=25;
    double i2=8.7;
    String n3="Steins;Gate";
    int e3=25;
    double i3=8.8;
    int n4=e1+e2+e3;
    boolean e4=e1>e2;
    boolean i4=i2>i3;
    System.out.println("\n"+"Anime 1");
    System.out.println("Name: "+n1);
    System.out.println("Episodes: "+e1);
    System.out.println("IMDB rating: "+i1+"\n");
    System.out.println("Anime 2");
    System.out.println("Name: "+n2);
    System.out.println("Episodes: "+e2);
    System.out.println("IMDB rating: "+i2+"\n");
    System.out.println("Anime 3");
    System.out.println("Name: "+n3);
    System.out.println("Episodes: "+e3);
    System.out.println("IMDB rating: "+i3+"\n");
    System.out.println("Total number of episodes: "+n4);
    System.out.println("One Piece has more episodes than Berserk: "+e4);
    System.out.println("Berserk has a higher rating than Steins;Gate: "+i4+"\n");
    }
    
}
