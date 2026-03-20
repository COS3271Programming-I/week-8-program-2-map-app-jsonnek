// Jonathan Sonnek
// March 19th 2026
// Map APP

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // creating maps
        Map<String, String> logins = new HashMap<>();
        Map<String, String> messages = new HashMap<>();
        // usernames and passwords to the login map
        logins.put("jason.miller", "s4nd9r2m");
        logins.put("sarah.thompson", "k7ft2p9w");
        logins.put("david.nguyen", "m3xq8n5r");
        logins.put("jonathan.sonnek", "b6wy4j1v");
        logins.put("marcus.reyes", "h2tz6k8d");
        // creating messages tied to each username
        messages.put("jason.miller", "Your report is due Friday.");
        messages.put("sarah.thompson", "Meeting rescheduled to 3pm.");
        messages.put("david.nguyen", "Please review the latest build.");
        messages.put("jonathan.sonnek", "Your request has been approved.");
        messages.put("marcus.reyes", "Check your email for updates.");

        // Login
        System.out.println("Enter your username: ");
        String username = input.nextLine();
        while (true) {
            if (logins.containsKey(username)) {
                break;
            }
            else {
                System.out.println("Invalid username. Please try again.");
                username = input.nextLine();
            }
        }
        System.out.println("Enter your password: ");
        String password = input.nextLine();
        while (true) {
            if (logins.get(username).equals(password)) {
                break;
            }
            else {
                System.out.println("Invalid password. Please try again.");
                password = input.nextLine();
            }
        }
        System.out.println("Hello " + username + " Here is your message: " + messages.get(username));
    }
}


