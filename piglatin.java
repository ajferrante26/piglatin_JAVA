import java.util.*;
import java.util.Scanner;

public class PigLatin
{
   public static void EnglishWordtoPigLatin(char *usrInput)
   {
      char ltrCaps[] = new char['B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'];
      char ltrLower[] = new char['b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'];
      int ltrPosi = -1;
      int ltrPosi;

      while (ltrPosi<0)
      {
         for (int j=0; j<21; j++)
         {
            if (usrInput[i] == ltrCaps[j] || usrInput[i] == ltrLower[j])
            {
               ltrPosi = i;
               ltrPosj = j;
               System.out.println("i = " + i + ", j = " + j);
            }
         }
         else 
            i++;
      }

      usrInput[i] = '';

      if (i==1)
      {
         char nextCaps;
         usrInput[(i+1)] = nextCaps;
         nextCaps = nextCaps.toUpperCase();
         usrInput[(i+1)] = nextCaps;
      }

      System.out.println(usrInput + "" + ltrLower[j] + "ay");
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      char usrInput[] = new char[200];
      usrInput = in.next();
      String usrInputStr = usrInput;

      int numWords = 0;

      for (int i=0; i<200; i++)
      {
         if (usrInput[i]==' ')
            numWords++;
      }

      if (numWords>1)
      {
         int wordPos[] = new int[numWords];
         int j = 0;
         for (int i=0; i<200; i++)
         {
            if (usrInput[i]==' ')
            {
               wordPos[j];
               j++;
            }
         }

         int wordLength[] = new int[numWords];
         wordLength[0] = wordPos[1] - 2;

         for (int i=1; i<numWords; i++)
            wordLength[i] = wordPos[(i+1)] - wordLength[(i-1)] - 1;

         for (int i=0; i<numWords; i++)
         {
            char wordArray[] = new char[wordLength[i]]

            for (int j=0; j<wordLength[i]; j++)
               wordArray[j] = usrInput[(wordPos[i]+j)];

            EnglishWordtoPigLatin(wordArray);
         }

      }
      else
      {
         int wordLength = 100;
//       I know this may be oversimplifying the process, but I chose 100 because the 
//       program still gets it's point across. Normally though I would have gotten 
//       the length of the singular word to be passed as wordLength as outligned in 
//       the method EnglishWordtoPigLatin(int, char *);

         EnglishWordtoPigLatin(usrInput); 
      }
   }
}
