/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package months;

import java.time.Month;
import java.util.EnumSet;


public class Months {

   
    public static void main(String[] args) {
        // TODO code application logic here
        EnumSet<Month>thirtyOneDayMonths = EnumSet.noneOf(Month.class);
        for(Month month : Month.values() ){
            if(month.maxLength()==31) {
                thirtyOneDayMonths.add(month);
                System.out.println(month);
            }
        }
                
    }
    
}
