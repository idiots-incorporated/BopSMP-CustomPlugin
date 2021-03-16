package bop;

import java.io.FileNotFoundException;
import java.util.UUID;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
//THE NASTIEST JSON IMPLEMENTATION OF ALL TIME
//I ABSOLUTELY DESPITE THIS PROGRAMMING LANGUAGE
//DEAR GOD
public class UUIDGrabber {
    public static UUID grabUUID(String name) {
        JsonParser jsonParser = new JsonParser();
        JsonElement obj;
        JsonObject Players;
        String bruh = "empty";
        try (FileReader reader = new FileReader("plugins/plugin-1.0/UUIDs.json")) {

            obj = jsonParser.parse(reader);

            Players = (JsonObject) obj.getAsJsonObject().get("Players");
            //gets UUIDs into String
            bruh = Players.getAsJsonObject().get(name).toString();
            //shaves off quotation marks from json.
            bruh = bruh.substring(1, bruh.length()-1);
            return UUID.fromString(bruh);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;

        } catch (IOException e) {
            e.printStackTrace();
            return null;

        } catch (IllegalArgumentException e) {
            //for in case UUIDs are formatted wrong.
            if(!bruh.equals("empty")) {System.out.println(bruh);}
            return null;
        }
    }
}
