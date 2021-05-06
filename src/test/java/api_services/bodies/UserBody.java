package api_services.bodies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserBody {

    /*
    {
  "name": "Leanne Graham",
  "username": "Bret",
  "email": "Sincere@april.biz",
  "address": {
    "street": "Kulas Light",
    "suite": "Apt. 556",
    "city": "Gwenborough",
    "zipcode": "92998-3874",
    "geo": {
      "lat": "-37.3159",
      "lng": "81.1496"
    }
  },
  "phone": "1-770-736-8031 x56442",
  "website": "hildegard.org",
  "company": {
    "name": "Romaguera-Crona",
    "catchPhrase": "Multi-layered client-server neural-net",
    "bs": "harness real-time e-markets"
  }
}

     */

    public UserBody(){

    }

    public UserBody(String name, String username,String email,Map<String,Object> address, String phone,
                    String website, Map<String,Object> company){
        this.name=name;
        this.username=username;
        this.email=email;
        this.address=address;
        this.phone=phone;
        this.website=website;
        this.company=company;

    }


    public void setAddress(String street, String suite, String city,String zipcode, String lat, String lng) {

        Map<String,String> geo= new HashMap<>();
        geo.put("lat",lat);
        geo.put("lng",lng);


         address= new HashMap<>();

        address.put("street",street);
        address.put("suite",suite);
        address.put("city",city);
        address.put("zipcode",zipcode);
        address.put("geo",geo);

    }

    public void setCompany(String companyName, String catchPhrase, String bs ){
        /*
        "company": {
    "name": "Romaguera-Crona",
    "catchPhrase": "Multi-layered client-server neural-net",
    "bs": "harness real-time e-markets"
         */

         company= new HashMap<>();

        company.put("name",companyName);
        company.put("catchPhrase",catchPhrase);
        company.put("bs",bs);

    }

private String name;
private String username;
private String email;
private Map<String,Object> address= new HashMap<>();

private String phone;
private String website;
private Map<String,Object> company= new HashMap<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, Object> getAddress() {
        return address;
    }

//    public void setAddress(List<Map<String, Object>> address) {
//        this.address = address;
//    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Map<String, Object> getCompany() {
        return company;
    }

//    public void setCompany(List<Map<String, String>> company) {
//        this.company = company;
//    }


    @Override
    public String toString() {
        return "UserBody{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company +
                '}';
    }
}
