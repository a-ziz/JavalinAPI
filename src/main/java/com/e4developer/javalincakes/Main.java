package com.e4developer.javalincakes;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7777);

        // run GET method on Postman at localhost:7777
        // lambda to return hello world
        //  app.get("/", ctx -> ctx.result("hello world"));

        app.get("/cakes", CakeController::getAllCakes);
        // change path to localhost:7777/cakes/

        // allow users to choose special cake
        app.get("/cakes/:special", CakeController::getSpecialCake);
    }
}
