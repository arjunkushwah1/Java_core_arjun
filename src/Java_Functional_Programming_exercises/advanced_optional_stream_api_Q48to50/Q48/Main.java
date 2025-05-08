package Java_Functional_Programming_exercises.advanced_optional_stream_api_Q48to50.Q48;

import java.util.Optional;

public class Main
{
    public static void main(String[] args) {
        Optional<User> user = Optional.of(new User(Optional.of(new Address("Delhi"))));

        String city = user
                .flatMap(User::getAddress)         // Optional<Address>
                .map(Address::getCity)             // Optional<String>
                .orElse("Unknown");                // Fallback if empty

        System.out.println("City: " + city);

    }
}
