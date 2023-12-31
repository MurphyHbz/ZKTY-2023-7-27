package com.mys.zkty.pojo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class User {
   private String userId;
   private String  username;
   private String  name;
   private String  password;
   private String  email;
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }



   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return "User{" +
              "userId='" + userId + '\'' +
              ", username='" + username + '\'' +
              ", name='" + name + '\'' +
              ", password='" + password + '\'' +
              ", email='" + email + '\'' +
              '}';
   }
}
