import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class ReadingJSON {
    public static void main(String args[]) {
        //Creating a JSONParser object
        JSONParser jsonParser = new JSONParser();
//        "firstName": "Joe",
//                "lastName": "Jackson",
//                "gender": "male",
//                "age": 28,
//                "number": "7349282382"
        try {
            //Parsing the contents of the JSON file
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Users\\tiy2c\\IdeaProjects\\LearnHowToUseData\\src\\sample4.json"));
            String first_name = (String) jsonObject.get("firstName");
            String last_name = (String) jsonObject.get("lastName");
            String gender = (String) jsonObject.get("gender");
            String age = (String) jsonObject.get("age").toString();
            String number = (String) jsonObject.get("number").toString();
            //Forming URL
            System.out.println("Contents of the JSON are: ");
            System.out.println("First name: "+first_name);
            System.out.println("Last name: "+last_name);
            System.out.println("Gender: "+gender);
            System.out.println("Age: "+age);
            System.out.println("Phone Number: "+number);
            System.out.println(" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}