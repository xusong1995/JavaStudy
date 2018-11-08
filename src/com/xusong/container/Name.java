package com.xusong.container;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-06 14:39
 */
public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object object) {
        if (object instanceof Name) {
            Name name = (Name) object;
            return (firstName.equals(name.firstName) && (lastName.equals(name.lastName)));
        }
        return super.equals(object);
    }

    public int hashCode() {
        return firstName.hashCode();
    }
}
