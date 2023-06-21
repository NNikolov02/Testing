package OnlineStore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    String username;
    String password;
    String emeil;

    public User(String username, String password, String emeil) {
        this.username = username;
        this.password = password;
        this.emeil = emeil;
    }
}
