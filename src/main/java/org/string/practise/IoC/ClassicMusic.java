package org.string.practise.IoC;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music {
    private List<String> classicList;

    public ClassicMusic(){
        classicList = new ArrayList<>(3);
        classicList.add("Turkish march");
        classicList.add("Requiem In D Minor");
        classicList.add("Symphony No. 9");
    }
    @Override
    public void getSong() {
        for(String elem : classicList){
            System.out.println(elem);
        }
    }
    public List<String> getClassicList() {
        return classicList;
    }
}
