//remember imports

import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

public class SongMath {
    public static void main(String[] args) {
        Map<String, Integer> song = new HashMap<>();
        song.put("3", 3);
        song.put("'69", 69);
        song.put("skater", 8);
        song.put("seven", 7);
        song.put("eleven", 11);
        song.put("twenty", 20);
        song.put("thirty", 30);
        song.put("sixty", 60);
        song.put("forward", 1);
        song.put("back", -3);
        song.put("nine", 9);
        song.put("four", 4);
        song.put("fifteen", 15);
        song.put("freshman", -9);
        song.put("senior", -12);
        song.put("six", 6);
        song.put("dime", 10);
        song.put("five", 5);
        song.put("22", 22);
        try(FileReader file = new FileReader("twenty.txt"); BufferedReader reader = new BufferedReader(file);
            FileWriter writer = new FileWriter("songmath.txt"); BufferedWriter buffer = new BufferedWriter(writer) ) {
            String line;
            int total = 0;
            while((line = reader.readLine())!= null){
                String[] arr = line.split(" ");
                for(int i =0; i < arr.length; i++){
                    if(song.containsKey(arr[i])){
                        int val = song.get(arr[i]);
                        total+=val;
                    }
                }
            }
            writer.write(total + " is an interesting number to get huh?");
            System.out.println(total);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //remember FileReader, BufferedReader for reading
        //FileWriter, BufferedWriter for writing

    }//end of main
}//end of class
