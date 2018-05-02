# CoolMovieApp

In order to use this app to fetch popular movies, you will use the API from themoviedb.org.

If you don’t already have an account, you will need to create one here: 
https://www.google.com/url?q=https://www.themoviedb.org/account/signup&sa=D&ust=1525025262335000
in order to request an API Key.
In your request for a key, state that your usage will be for educational/non-commercial use. You will also need to provide some personal information to complete the request. Once you submit your request, you should receive your key via email shortly after.

Once you obtain your key, insert it into a java class named 'SecretApiConstants,java' within the root directory for the app.  
add the following code:

public class SecretApiConstants {

    public static String movieApiConstant = "{INSERT YOUR OWN API CODE HERE}";
}

If you use this snippet, the .gitignore file will prevent pushing that file to Github.
But take care not to add it on creation!
Alternatively, you may place it in a file of another type, and access it as a variable, and just make sure to add
that file's relative path to the .gitignore file
