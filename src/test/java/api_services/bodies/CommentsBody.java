package api_services.bodies;

import java.util.HashMap;
import java.util.Map;

public class CommentsBody {
    /*
    {
  "postId": 1,
  "id": 1,
  "name": "id labore ex et quam laborum",
  "email": "Eliseo@gardner.biz",
  "body": "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"
}
     */

    public static Map<String, Object> commentBody(String name, String email, String body){
      Map<String, Object> payload= new HashMap<>();
      payload.put("name",name);
      payload.put("email",email);
      payload.put("body",body);


        return payload;
    }
}
