package com.lostsheep.java.design.mode.builder;

/**
 * <b><code>User</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/21 2:43.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class User {

    private Integer id;
    private String name;
    private String age;

    public User() {
    }

    public User(Integer id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static User.UserBuilder builder() {
        return new User.UserBuilder();
    }

    public static class UserBuilder {
        private Integer id;
        private String name;
        private String age;

        public UserBuilder() {
        }

        public User.UserBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public User.UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public User.UserBuilder age(String age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this.id, this.name, this.age);
        }

        @Override
        public String toString() {
            return "UserBuilder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }

    }

}
