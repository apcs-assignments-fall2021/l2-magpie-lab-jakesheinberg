/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    { String statement2 = statement.trim();
        String response = "";
        if (findWord(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (findWord(statement, "mother") >= 0
                || findWord(statement, "father") >= 0
                || findWord(statement, "sister") >= 0
                || findWord(statement, "brother") >= 0)
        {
            response = "Tell me more about your family.";
        }else if(findWord(statement, "dog") >= 0
        ||findWord(statement, "cat") >= 0
        ||findWord(statement, "pets") >= 0){
            response = "Tell me more about your pets.";
        }else if(findWord(statement, "Nathan") >= 0){
            response = "I love Nathan. He is papa.";
        }
        else if(statement2.length()<0){
            response = "say something hombre!";
        }else if(findWord(statement, "sports") >= 0){
            response = "What is your favorite sport?";

    }else if(findWord(statement, "food")>=0){
            response = "What is your favorite food?";
        }else
        {
            response = getRandomResponse();
        }
        return response;
    }
    
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    public String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse==4){
            response = "You are a fool";
        }else if (whichResponse==5){
            response = "Thank my author Jake";
        }

        return response;
    }

    // Checks to see if the String word appears as a whole word
    // in the String str (in this case, a "whole word" means that 
    // word is not just a substring of some larger word in str)

    // This method should work regardless of the capitalization 
    // of str or word

    // The method returns the index of the first character in word
    // if it is found, and returns -1 otherwise. 
    public int findWord(String str, String word) {
        str = str.toLowerCase();
        word = word.toLowerCase();
        int yes=-1;
        if(str.indexOf(word)!=-1){
            if((str.indexOf(word)==0
            ||str.charAt(str.indexOf(word)-1)==' ') && (str.indexOf(word)+word.length()==str.length()
                    ||str.charAt(str.indexOf(word)+word.length())==' ')){
            yes = str.indexOf(word);}
           }
    return yes;}

    
    // We will work on the following methods later!

    /**
     * Take a statement with "I want <something>." and transform it into 
     * "Would you really be happy if you had <something>?"
     * @param statement the user statement, assumed to contain "I want"
     * @return the transformed statement
     */
    public String transformIWantStatement(String statement)
    {statement = statement.toLowerCase();
        String returnState = " ";
        if (findWord(statement, "I want" )>=0){
        int lastWord = statement.indexOf("I want") + 7;
        String wanted = statement.substring(lastWord,statement.length());
        returnState = "Would you really be happy if you had" + wanted + "?";
        }
        return returnState;
    }

    /**
     * Take a statement with "I <something> you" and transform it into 
     * "Why do you <something> me?"
     * @param statement the user statement, assumed to contain "I" followed by "you"
     * @return the transformed statement
     */
    public String transformIYouStatement(String statement)
    {
        //your code here
        return "";
    }

    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    public String transformIWantToStatement(String statement)
    {
        // your code here
        return "";
    }




    /**
     * Take a statement with "you <something> me" and transform it into 
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    public String transformYouMeStatement(String statement)
    {
        // your code here
        return "";
    }
}
