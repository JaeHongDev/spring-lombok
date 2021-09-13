package com.hong.lombok.Val;

import java.util.ArrayList;

import lombok.val;

public class Val {
  
}

class ValExample{

  public String example(){
    val example = new ArrayList<String>();
    example.add("hello world");
    val foo = example.get(0);
    return foo.toLowerCase();
  }
}


class NonValExample {

  public String case1(){
    final ArrayList<String> example = new ArrayList<String>();
    example.add("hello world");
    final String foo =example.get(0);
    return foo.toLowerCase();
  }
}

// val 타입의 불변성을 제공하기 위함
