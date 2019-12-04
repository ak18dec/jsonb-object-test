package com.github.phillipkruger.jsonbobjecttest;

import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

public class MySerializer implements JsonbSerializer<Object> {
    @Override
    public void serialize(Object obj, JsonGenerator generator, SerializationContext ctx) {
        System.out.println("serialize: " + obj);
        generator.writeStartObject();
        if (obj instanceof Dog) {
            Dog d = (Dog) obj;
            generator.write("@@name", d.name);
            generator.write("@@age", d.age);
        }
        generator.writeEnd();
    }
}
