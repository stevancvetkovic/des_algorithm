package paket;

import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.*;

public class Funkcije
{
    public static int[] pc_e ={ 32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8,
				   9, 10, 11, 12, 13, 12, 13, 14, 15, 16,
				   17, 16, 17, 18, 19, 20, 21, 20, 21, 22,
				   23, 24, 25, 24, 25, 26, 27, 28, 29, 28,
				   29, 30, 31, 32, 1 };

    public static int[][] s1 ={
        { 14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7 },
	{ 0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8 },
	{ 4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0 },
	{ 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13 } };

    public static int[][] s2 ={
        { 15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10 },
	{ 3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5 },
	{ 0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15 },
	{ 13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9 } };

    public static int[][] s3 ={
        { 10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8 },
	{ 13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1 },
	{ 13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7 },
	{ 1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12 } };

    public static int[][] s4 ={
        { 7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15 },
	{ 13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9 },
	{ 10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4 },
	{ 3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14 } };

    public static int[][] s5 ={
        { 2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9 },
	{ 14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6 },
	{ 4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14 },
	{ 11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3 } };

    public static int[][] s6 ={
        { 12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11 },
	{ 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8 },
	{ 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6 },
	{ 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13 } };

    public static int[][] s7 ={
        { 4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1 },
	{ 13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6 },
	{ 1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2 },
	{ 6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12 } };

    public static int[][] s8 ={
        { 13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7 },
	{ 1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2 },
	{ 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8 },
        { 2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11 } };

    public static int[] pc_p ={
        16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23,
        26, 5, 18, 31, 10, 2, 8, 24, 14, 32,
        27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25 };
    
    public int[] obrada(int[] M)
    {
        Funkcije f = new Funkcije();

        int[] L = new int[32];
        int[] R = new int[32];

        for(int i=0; i<32; i++)
        {
            L[i] = M[i];
            R[i] = M[i+32];
        }
        
        int[] temp = new int[32];
        
        for(int i=0; i<16; i++)
        {
            int nizE[] = f.expansion(R);
            int nizKM[] = f.keyMixing(nizE, i);
            int nizS[] = f.substitution(nizKM);
            int nizP[] = f.permutation(nizS);

            for(int j=0; j<32; j++)
            {
                temp[j] = nizP[j] ^ L[j];
                L[j] = R[j];
                R[j] = temp[j];
            }
        }
        
        int[] cipher = new int[64];

        for(int i=0; i<32; i++)
        {
            cipher[i] = L[i];
            cipher[i+32] = R[i];
        }

        return cipher;
    }

    public Kljuc[] vratiKljuceve()
    {
        Kljuc[] lista = new Kljuc[0];
        Sax handler = new Sax();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        {
            try
            {
                SAXParser saxParser = factory.newSAXParser();
                saxParser.parse(new File("keys.xml"), handler);
                Sax sm = (Sax)handler;

                lista = new Kljuc[sm.brojKljuceva];
                for (int i=0; i<sm.brojKljuceva; i++)
                {
                    lista[i] = new Kljuc();
                    lista[i] = sm.nizKljuceva[i];
                }
            }
            catch (SAXException spe)
            {
                System.out.println("\n** Parsing error" + ", line " + spe.getMessage() + ", uri " + spe.getMessage());
            }
            catch (Throwable t)
            {
                 t.printStackTrace();
            }
        }
        return lista;
    }

    public int[] expansion(int[] ulaz)
    {
        int[] nUlaz = new int[32];
        int[] nizE = new int[48];
        int j=0;
        
        for(int i=32; i<ulaz.length; i++)
            nUlaz[j++] = ulaz[i];

        for(int k=0; k<nizE.length; k++)
            nizE[k] = nUlaz[pc_e[k]-1];

        return nizE;
    }

    public int[] keyMixing(int[] nizE, int runda)
    {
        Funkcije f = new Funkcije();
        Kljuc[] lista = new Kljuc[0];
        lista = f.vratiKljuceve();
        int[] nizKM = new int[48];
        
        String kljuc = lista[runda].getKljuc();
        int[] nizK = new int[48];
        char[] cKljuc = kljuc.toCharArray();

        for(int i=0; i<cKljuc.length; i++)
            nizK[i] = cKljuc[i] % 48;

        for(int i=0; i<nizKM.length; i++)
            nizKM[i] = nizK[i] ^ nizE[i];

        return nizKM;
    }

    public int[] substitution(int[] nizKM)
    {
        int[] nizS1 = new int[6];
        int[] nizS2 = new int[6];
        int[] nizS3 = new int[6];
        int[] nizS4 = new int[6];
        int[] nizS5 = new int[6];
        int[] nizS6 = new int[6];
        int[] nizS7 = new int[6];
        int[] nizS8 = new int[6];

        for(int i=0; i<6; i++)
        {
            nizS1[i] = nizKM[i];
            nizS2[i] = nizKM[i+6];
            nizS3[i] = nizKM[i+12];
            nizS4[i] = nizKM[i+18];
            nizS5[i] = nizKM[i+24];
            nizS6[i] = nizKM[i+30];
            nizS7[i] = nizKM[i+36];
            nizS8[i] = nizKM[i+42];
        }

        // S1
        int vrstaS1 = Integer.parseInt("" + nizS1[0] + nizS1[5], 2);
        int kolonaS1 = Integer.parseInt("" + nizS1[1] + nizS1[2] + nizS1[3] + nizS1[4], 2);
        int nVrednostS1 = s1[vrstaS1][kolonaS1];
        int[] bin1 = this.decimal2Binary(nVrednostS1);

        // S2
        int vrstaS2 = Integer.parseInt("" + nizS2[0] + nizS2[5], 2);
        int kolonaS2 = Integer.parseInt("" + nizS2[1] + nizS2[2] + nizS2[3] + nizS2[4], 2);
        int nVrednostS2 = s2[vrstaS2][kolonaS2];
        int[] bin2 = this.decimal2Binary(nVrednostS2);

        // S3
        int vrstaS3 = Integer.parseInt("" + nizS3[0] + nizS3[5], 2);
        int kolonaS3 = Integer.parseInt("" + nizS3[1] + nizS3[2] + nizS3[3] + nizS3[4], 2);
        int nVrednostS3 = s3[vrstaS3][kolonaS3];
        int[] bin3 = this.decimal2Binary(nVrednostS3);

        // S4
        int vrstaS4 = Integer.parseInt("" + nizS4[0] + nizS4[5], 2);
        int kolonaS4 = Integer.parseInt("" + nizS4[1] + nizS4[2] + nizS4[3] + nizS4[4], 2);
        int nVrednostS4 = s4[vrstaS4][kolonaS4];
        int[] bin4 = this.decimal2Binary(nVrednostS4);

        // S5
        int vrstaS5 = Integer.parseInt("" + nizS5[0] + nizS5[5], 2);
        int kolonaS5 = Integer.parseInt("" + nizS5[1] + nizS5[2] + nizS5[3] + nizS5[4], 2);
        int nVrednostS5 = s5[vrstaS5][kolonaS5];
        int[] bin5 = this.decimal2Binary(nVrednostS5);

        // S6
        int vrstaS6 = Integer.parseInt("" + nizS6[0] + nizS6[5], 2);
        int kolonaS6 = Integer.parseInt("" + nizS6[1] + nizS6[2] + nizS6[3] + nizS6[4], 2);
        int nVrednostS6 = s6[vrstaS6][kolonaS6];
        int[] bin6 = this.decimal2Binary(nVrednostS6);

        // S7
        int vrstaS7 = Integer.parseInt("" + nizS7[0] + nizS7[5], 2);
        int kolonaS7 = Integer.parseInt("" + nizS7[1] + nizS7[2] + nizS7[3] + nizS7[4], 2);
        int nVrednostS7 = s7[vrstaS7][kolonaS7];
        int[] bin7 = this.decimal2Binary(nVrednostS7);

        // S8
        int vrstaS8 = Integer.parseInt("" + nizS8[0] + nizS8[5], 2);
        int kolonaS8 = Integer.parseInt("" + nizS8[1] + nizS8[2] + nizS8[3] + nizS8[4], 2);
        int nVrednostS8 = s8[vrstaS8][kolonaS8];
        int[] bin8 = this.decimal2Binary(nVrednostS8);
        

        int[] nizS = new int[32];

        for(int i=0; i<4; i++)
        {
            nizS[i] = bin1[i];
            nizS[i+4] = bin2[i];
            nizS[i+8] = bin3[i];
            nizS[i+12] = bin4[i];
            nizS[i+16] = bin5[i];
            nizS[i+20] = bin6[i];
            nizS[i+24] = bin7[i];
            nizS[i+28] = bin8[i];
        }

        return nizS;
    }

    public int[] permutation(int[] nizS)
    {
        int[] nizP = new int[32];

        for(int i=0; i<nizS.length; i++)
            nizP[i] = nizS[pc_p[i]-1];
        
        return nizP;
    }

    public int[] decimal2Binary(int dec)
    {
        String bi = Integer.toBinaryString(dec);
        int[] izlaz = new int[4];

        char[] b = bi.toCharArray();

        for(int i=0; i<b.length; i++)
            izlaz[i] = b[i] % 48;

        return izlaz;
    }
}
