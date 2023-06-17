package org.string.practise.IoC;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> rockList;

    public RockMusic(){
        rockList = new ArrayList<>(3);
        rockList.add("Highway To Hell");
        rockList.add("Back In Black");
        rockList.add("Shut Your Mouth");
    }
    @Override
    public void getSong() {
        for(String elem : rockList){
            System.out.println(elem);
        }
    }
    public List<String> getRockList() {
        return rockList;
    }
}
