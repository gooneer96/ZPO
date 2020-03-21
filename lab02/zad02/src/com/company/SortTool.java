package com.company;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Arrays;


public class SortTool{

    public static void sortStrings(Collator collator, String[] words)  // sortującą napisy ręcznie i naiwnie, z użyciem sortowania przez wstawianie (insertion sort),
        {
        for (int i = 1; i < words.length; i++) {
            String element = words[i];
            int j;
            for (j = i - 1; j >= 0 && collator.compare(element, words[j]) <= 0; j--)
                words[j + 1] = words[j];

            words[j + 1] = element;
        }
    }


    public static void fastSortStrings(Collator collator, String[] words)
    {
        Arrays.sort(words, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return collator.compare(s1, s2);
            }

        });
    }
    public static void fastSortStrings2(Collator collator, String[] words)
    {
        Arrays.sort(words, (s1, s2) -> collator.compare(s1, s2));
    }
/*sortujące napisy z użyciem wordss.sort(…).
    Różnica między tymi dwiema metodami jest taka, że fastSortStrings ma używać anonimowego obiektu komparatora,
    zaś fastSortStrings2 ma wykorzystać funkcję lambda.
*/


}

