//JSON Encode Example

//import java.io.*;
//
//import org.json.simple.*;
//
//class Json {
//
//	public static void main(String[] args) {
//		
//	      JSONObject obj = new JSONObject();
//
//	      obj.put("name","foo");
//	      obj.put("num",new Integer(100));
//	      obj.put("balance",new Double(1000.21));
//	      obj.put("is_vip",new Boolean(true));
//
//	      StringWriter out = new StringWriter();
//	      try {
//			obj.writeJSONString(out);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	      
//	      String jsonText = out.toString();
//	      System.out.print(jsonText);
//	   }
//}


//JSON Decode Example

//import org.json.simple.JSONObject;
//import org.json.simple.JSONArray;
//import org.json.simple.parser.ParseException;
//import org.json.simple.parser.JSONParser;
//
//class Json {
//
//   public static void main(String[] args) {
//	
//      JSONParser parser = new JSONParser();
//      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
//		
//      try{
//         Object obj = parser.parse(s);
//         JSONArray array = (JSONArray)obj;
//			
//         System.out.println("The 2nd element of array");
//         System.out.println(array.get(1));
//         System.out.println();
//
//         JSONObject obj2 = (JSONObject)array.get(1);
//         System.out.println("Field \"1\"");
//         System.out.println(obj2.get("1"));    
//
//         s = "{}";
//         obj = parser.parse(s);
//         System.out.println(obj);
//
//         s = "[5,]";
//         obj = parser.parse(s);
//         System.out.println(obj);
//
//         s = "[5,,2]";
//         obj = parser.parse(s);
//         System.out.println(obj);
//      }catch(ParseException pe) {
//		
//         System.out.println("position: " + pe.getPosition());
//         System.out.println(pe);
//      }
//   }
//}

//JSON Encode Example 2
//import org.json.simple.JSONObject;
 
// Program for print data in JSON format.
//public class Json {
//    public static void main(String args[])
//    {
//        // In java JSONObject is used to create JSON object
//        // which is a subclass of java.util.HashMap.
// 
//        JSONObject file = new JSONObject();
// 
//        file.put("Full Name", "Omkar Pawar");
//        file.put("Roll No.", new Integer(1704310046));
//        file.put("Tuition Fees", new Double(65400));
// 
//        // To print in JSON format.
//        System.out.print(file);
//    }
//}


//JSON Decode Example 2

//import org.json.simple.JSONObject;
//import org.json.simple.JSONValue;
// 
//public class Json {
// 
//    public static void main(String[] args)
//    {
//        // Converting JSON data into Java String format
//        String k = "{\"Full Name\":\"Omkar Pawar	\", \"Tuition Fees\":65400.0, \"Roll No.\":1704310046}";
//        Object file = JSONValue.parse(k);
// 
//        // In java JSONObject is used to create JSON object
//        JSONObject jsonObjectdecode = (JSONObject)file;
// 
//        // Converting into Java Data type
//        // format From Json is the step of Decoding.
//        String name
//            = (String)jsonObjectdecode.get("Full Name");
//        double fees
//            = (Double)jsonObjectdecode.get("Tuition Fees");
//        long rollno
//            = (Long)jsonObjectdecode.get("Roll No.");
//        System.out.println(name + " " + fees + " "
//                           + rollno);
//    }
//}