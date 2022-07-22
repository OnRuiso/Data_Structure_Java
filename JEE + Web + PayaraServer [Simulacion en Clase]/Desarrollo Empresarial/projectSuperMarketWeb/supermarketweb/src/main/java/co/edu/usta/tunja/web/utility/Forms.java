/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.web.utility;

import java.util.List;
import javax.faces.model.SelectItem;

/**
 *
 * @author ruiso
 */
public class Forms {
    public static SelectItem[] addObject(List<?>objectList, String textFirstChoise){
        int index = 0;
        int size=objectList.size();
        SelectItem[] itemList;
        
        if (textFirstChoise != null &&! textFirstChoise.isEmpty()){
            size = size + 1;
            index = index + 1;
            itemList = new SelectItem[size];
            itemList[0] = new SelectItem("",textFirstChoise);
        }else{
            itemList = new SelectItem[size];
        }
        
        for(Object obj:objectList){
            itemList[index] = new SelectItem(obj,obj.toString());
            index++;
        }
        
        return itemList;
    }
}
