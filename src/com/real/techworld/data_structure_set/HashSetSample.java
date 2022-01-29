package com.real.techworld.data_structure_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample {

    private Set<Integer> myHashSet = new HashSet<>();

    public HashSetSample()
    {

        getMyHashSet().add(1);
        getMyHashSet().add(2);
        getMyHashSet().add(1); // even we add this duplicate element

        //myHashSet.isEmpty();
       // myHashSet.contains(2);
        //myHashSet.remove(1);

      for (Integer element: getMyHashSet())
      {
          System.out.println(element + " Element");
      }

        System.out.println("value from hashset"+ getMyHashSet().stream().findAny());
    }

    public Set<Integer> getMyHashSet() {
        return myHashSet;
    }

    public void setMyHashSet(Set<Integer> myHashSet) {
        this.myHashSet = myHashSet;
    }
}
