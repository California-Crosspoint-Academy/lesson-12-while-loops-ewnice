// Eunice Chan
// 2025-09-17
public class Magpie {

    public String getGreeting() {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement) {
        if (statement.trim().length() == 0) {
            return "Say something, please.";
        } else if (statement.equalsIgnoreCase("bye")) { // Handle any form of "bye"
            return "Goodbye!";
        } else if (statement.contains("no")) {
            return "Why so negative?";
        } else if (statement.contains("cat") || statement.contains("dog")) {
            return "Tell me more about your pets.";
        } else {
            return getRandomResponse(); 
        }
    }

    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 4;

        int whichResponse = (int) (Math.random() * NUMBER_OF_RESPONSES);

        String response = "";

        if (whichResponse == 0) {
            response = "Interesting.";
        } else if (whichResponse == 1) {
            response = "Okay.";
        } else if (whichResponse == 2) {
            response = "I haven't heard that before.";
        } else if (whichResponse == 3) {
            response = "What else could you tell me about that?";
        }

        return response;
    }
}
