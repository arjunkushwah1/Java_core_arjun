package Java_Functional_Programming_exercises.advanced_optional_stream_api_Q48to50.Q48;

import java.util.Optional;

public class User
{
    private Optional<Address> address;

    public User(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}
