package SpringWithCassandra.SpringWithCassandra.Model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "user")
public class User {
    @PrimaryKey
    private Integer userId;
   private String name;
   public User(){}
    public User(Integer userId, String name) {
        this.userId = userId;
        this.name = name;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
