package Repository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String lastName;

    public User(long id, String name, int age) {
    }

    public int getAge() {
        return 0;
    }
}