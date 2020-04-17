package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudyProcess {

    private Random rand = new Random();

    private static List<Base> readFile(String path) {
        List<Base> list = new ArrayList<>();
        int i=0;
        try (Scanner s = new Scanner(new FileReader(path))) {
            while (s.hasNext()) {
                list.add(new Base(i,false,0, s.nextLine()));
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    private Base getRandomElement(List<Base> list)
    {
        Base check=list.get(rand.nextInt(list.size()));
        while(check.getIsLearned())
        {
            check=list.get(rand.nextInt(list.size()));
        }

        return list.get(rand.nextInt(list.size()));
    }

    private void newWords(int i, List<Base> listSource, List<Base> listResult){

        Base newWord1,newWord2;
        newWord1=getRandomElement(listSource);
        newWord1.setIsLearned();
        newWord1.setLearnedAtDay(i);
        listSource.set(newWord1.getIndex(),newWord1);
        listResult.add(newWord1);
        newWord2=getRandomElement(listSource);
        newWord2.setIsLearned();
        newWord2.setLearnedAtDay(i);
        listSource.set(newWord2.getIndex(),newWord2);
        listResult.add(newWord2);
        System.out.println("New words:            "+newWord1.getWord()+"  "+newWord2.getWord());
    }

    private void forgotWords(int j, int k, List<Base> listSource, List<Base> listResult){

        Base forgottenWord;
        boolean isSthForgotten =false;
        int forgottenWords=0;
        boolean val = rand.nextInt(2)==0;
        System.out.print("Forgotten words:      ");
        for (int i = 0; i < listResult.size(); i++)  {
                if (val) {
                    forgottenWord = listResult.get(i);

                    if (forgottenWord.getLearnedAtDay() < j-k) {
                        listResult.remove(forgottenWord);
                        forgottenWord.setIsNotLearned();
                        listSource.set(forgottenWord.getIndex(), forgottenWord);
                        System.out.print(forgottenWord.getWord() + " ");
                        isSthForgotten = true;
                        forgottenWords += 1;
                        if(forgottenWords==2)
                            break;
                    }
                }
                val = rand.nextInt(2) == 0;
        }
        if(!isSthForgotten)
        {
            System.out.print("----");
        }
        System.out.println();
    }

    void dailySubmit(int n, int k,String path){

        List<Base> words = readFile(path);
        List<Base> knownWords = new ArrayList<>();
        //System.out.println(words);

        for(int i=1;i<=n;i++)
        {
            System.out.println("Day: "+i);
            newWords(i,words,knownWords);
            forgotWords(i,k,words,knownWords);
            System.out.print("[" + knownWords.get(0).getWord());
            for(int j=1;j<knownWords.size();j++) {
                System.out.print(", "+knownWords.get(j).getWord());
            }
            System.out.println("]");
        }



    }
}
