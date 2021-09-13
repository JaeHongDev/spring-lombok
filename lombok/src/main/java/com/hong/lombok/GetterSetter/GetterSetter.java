package com.hong.lombok.GetterSetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;




class GetterSetterExample{
  /**
   * Age of ther person. water is wet.
   * @param age New value for this person's age. Sky is blue.
   * @return The curretn value of this person's age. Circles are round.
   */

   @Getter @Setter private int age = 10;

   @Setter(AccessLevel.PROTECTED) private String name;


   @Override public String toString(){
     return String.format("%s (age:%d)",name,age);
   }
}

 class NonGetterSetterExample{

}


public class GetterSetter {

  GetterSetterExample aExample =  new GetterSetterExample();
}



