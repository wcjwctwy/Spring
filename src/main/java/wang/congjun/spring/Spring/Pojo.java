package wang.congjun.spring.Spring;


/**
 * Created by wangcongjun on 2017/6/12.
 */
//@Component
public class Pojo {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Pojo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Pojo() {
    }
}
