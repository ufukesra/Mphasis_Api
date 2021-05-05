package api_services.bodies;


import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

/*
{
  "userId": 1,
  "id": 1,
  "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
  "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
}
 */
public class PostBody {


    public static Map<String,Object> postBody(String title,String body){
        Map<String, Object> payload= new HashMap<>();
        Faker faker= new Faker();


        payload.put("title",title );
        payload.put("body", body);

    return payload;
    }




}
