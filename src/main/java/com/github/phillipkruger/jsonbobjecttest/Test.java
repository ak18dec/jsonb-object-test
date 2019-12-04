package com.github.phillipkruger.jsonbobjecttest;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;


public class Test {

    public static void main(String args[]) throws Exception {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withSerializers(new MySerializer()));
        Dog d = new Dog();
        d.name = "Spot";
        d.age = 42;
        System.out.println("JSON " + jsonb.toJson(d));
        // prints:          JSON {"@@name":"Spot","@@age":42}
    }
}