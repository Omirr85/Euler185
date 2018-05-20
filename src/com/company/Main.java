package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        var givenList = new ArrayList<Given>();
        givenList.add(new Given("5616185650518293",2));
        givenList.add(new Given("3847439647293047",1));
        givenList.add(new Given("5855462940810587",3));
        givenList.add(new Given("9742855507068353",3));
        givenList.add(new Given("4296849643607543",3));
        givenList.add(new Given("3174248439465858",1));
        givenList.add(new Given("4513559094146117",2));
        givenList.add(new Given("7890971548908067",3));
        givenList.add(new Given("8157356344118483",1));
        givenList.add(new Given("2615250744386899",2));
        givenList.add(new Given("8690095851526254",3));
        givenList.add(new Given("6375711915077050",1));
        givenList.add(new Given("6913859173121360",1));
        givenList.add(new Given("6442889055042768",2));
        givenList.add(new Given("2321386104303845",0));
        givenList.add(new Given("2326509471271448",2));
        givenList.add(new Given("5251583379644322",2));
        givenList.add(new Given("1748270476758276",3));
        givenList.add(new Given("4895722652190306",1));
        givenList.add(new Given("3041631117224635",3));
        givenList.add(new Given("1841236454324589",3));
        givenList.add(new Given("2659862637316867",2));

        givenList.sort(Comparator.comparing(Given::getCorrect));

        for (long l = 100000000000000L; l < 1000000000000000L; l++){
            System.out.println(l);
            if (verify(l,givenList))
                System.out.println(l);
        }
    }

    private static boolean verify(long l, ArrayList<Given> givenList) {
        var t = String.valueOf(l);
        while (t.length() < 16)
            t = "0" + t;
        var s= t.toCharArray();


        for(Given g : givenList)
        {
            g.Reset();
        }

        for(Given g : givenList)
        {
            for (int i=0;i<s.length;i++)
            {
                if (g.getCharArray()[i] == s[i])
                    g.IncreaseCurrent();
                if (!g.CheckCurrent())
                    return false;
            }

        }

        for(Given g : givenList)
        {
            if (!g.VerifyCurrent())
                return false;
        }

        return true;
    }
}
