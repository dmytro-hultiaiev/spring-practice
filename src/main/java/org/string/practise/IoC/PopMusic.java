package org.string.practise.IoC;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
    private List<String> popList;

    public PopMusic(){
        popList = new ArrayList<>(3);
        popList.add("Love You Like A Love Song");
        popList.add("Gimme More");
        popList.add("Hot N Cold");
    }
    @Override
    public void getSong() {
        for(String elem : popList){
            System.out.println(elem);
        }
    }
    public List<String> getPopList() {
        return popList;
    }
}
