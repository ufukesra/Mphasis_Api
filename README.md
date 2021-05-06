
Full Name : Ufuk Sahinduran

Project Title : JsonPlaceHolder.Typicode(posts/comments/users)  API testing framework for Mphasis

Installation guide: This is a maven project. so It's assumed that the host running this code have Java and maven
installed and JAVA_HOME already set. Here is the guide for maven installation just in
link : https://maven.apache.org/install.html Project get all dependencies from maven repository.
So no additional installation needed.
pom.xml file:
Below are the dependencies are being used for this project :
Cucumber Java, Cucumber JUnit, RestAssured library, Faker, SchemaValidator,Jackson, Cucumber Reports plugins.


                       API Testing:
api_services Package:
    bodies Package:
        CommentsBody class: created a method which returns a comment body.
        PostBody class: created a method which returns a post body.
        UserBody class: I have created a java object by using  Java Encapsulation and then converted it to a json object 
            by using Jackson library in order to create user body. it is calling as Serialization, and the class calling as  POJO.
    
    Comments class:I have written methods and created variables for comments endPoint.
    Posts class:I have written methods and created variables for posts endPoint.
    Users class: I have written methods and created variables for users endPoint.


runner Package:
    CukesRunner class: This class is for running my test by using cucumber options which contains
        plugins(cucumber reports) feature file pathway, step definitions pathway and dryRun.


step_def Package:
    Hook class: this class is for running before and after methods for each and every scenario.
        I have added scenario names, base Url in before method and  reset RestAssured in after method.
    CommentStepDef class:  This class contains object of Comments class in order to use instance methods from
        the class.It is for running comments scenarios' test steps.
    PostStepDef class :This class contains object of Post class in order to use instance methods from
        the class.It is for running posts scenarios' test steps.
    UserStepDef class :This class contains object of User class in order to use instance methods from
        the class.It is for running users scenarios' test steps.


utilities Package:
ConfigurationReader class: this class is for reading data from Config file.

resources: this directory is for storing feature file which contains my scenarios.
 feature directory:
    comments.feature file: Written test scenario and steps and storing the data for comments endpoint by using Gherkin.
    post.feature file: Written test scenario and steps and storing the data for post endpoint by using Gherkin.
    user.feature file: Written test scenario and steps and storing the data for user endpoint by using Gherkin.
Test Scenarios: created based on BDD by using Gherkin syntax

 commentsBody.json file: storing comment json data in order to validate specific comment response body.
 postBody.json file: storing post json data in order to validate specific post response body.
 userBody.json file: storing user json data in order to validate specific user response body.


configuration.properties: This is the file that I stored base Url.

pom.xml:
Below are the dependencies are being used for this project :
Cucumber Java, Cucumber JUnit, RestAssured library, Faker, SchemaValidator,Jackson, Cucumber Reports plugins.



        NOTES

1- Successfully created user is not coming with id.
2- A previously created user shouldn't be created again but it can.
3- Response user List body is not a json data, it is an array so that  I can't do Schema validation of any List.
4- Post (create) user request accept all json data type(invalid json body) and cerate next user id which is 11
5- Create new user with not Json format body should respond 400 Bad request but is 500 Internal Server Error
6- I see the all Id types are integer where are in the response bodies, but it accepts String value for schema validation