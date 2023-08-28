package com.e4developer.javalincakes;

import io.javalin.http.Context;

import java.util.Arrays;

public final class CakeController {
  private CakeController(){}

  static String[] availableCakes = {"special cake", "cheese cake", "chocolate cake", "strawberry cake"};

  public static void getAllCakes(Context context) {
//    context.result(Arrays.toString(availableCakes));
    context.json(availableCakes);
  }

  public static void getSpecialCake(Context context) {
    for(String cake: availableCakes){
      if(cake.contains((context.pathParam("special")))){
        context.result(cake);
        return;
      }
    }
    context.result("No Cake Found");
  }
}
