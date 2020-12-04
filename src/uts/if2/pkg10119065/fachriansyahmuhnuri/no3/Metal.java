/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119065.fachriansyahmuhnuri.no3;

/**
 *
 * @author Fachriansyah PC
 */
public class Metal extends HardRock implements HeavyMetal{
    public void genreMetal(String artistName)
    {
        System.out.println(artistName + " adalah musisi Metal");
    }
    public void genrePunk(String artistName)
    {
        System.out.println(artistName + " adalah musisi Punk");
    }
    public void genreGrunk(String artistName)
    {
        System.out.println(artistName + " adalah musisi Grunk");
    }

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName + " adalah musisi Heavy Metal");
    }
}
