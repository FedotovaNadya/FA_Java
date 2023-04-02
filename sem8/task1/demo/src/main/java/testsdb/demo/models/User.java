package testsdb.demo.models;

import jakarta.persistence.*;

@Entity(name="`user`")
public class User {
    @Id
    @Column(name="row_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rowId;
    @Column(name="group_id")
    private Long groupId;
    @Column(name="role_id")
    private Long roleId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="middle_name")
    private String middleName;
    @Column(name="login")
    private String login;
    @Column(name="password_hash")
    private String passwordHash;

    public User() {
    }

    public User(Long row_id, Long group_id, Long role_id, String first_name, String last_name, String middle_name, String login, String password_hash) {
        this.rowId = row_id;
        this.groupId = group_id;
        this.roleId = role_id;
        this.firstName = first_name;
        this.lastName = last_name;
        this.middleName = middle_name;
        this.login = login;
        this.passwordHash = password_hash;
    }

    public Long getRowId() {
        return rowId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long group_id) {
        this.groupId = group_id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long role_id) {
        this.roleId = role_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middle_name) {
        this.middleName = middle_name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String password_hash) {
        this.passwordHash = password_hash;
    }
}