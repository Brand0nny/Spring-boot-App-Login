package com.bran.springboot.application.login_application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ChangePasswordForm {
    @NotNull
    private Long id;
    @NotBlank(message ="Current password must not be blank")
    private String currentPassword;
    @NotBlank(message ="New password must not be blank")
    private String newPassword;
    @NotBlank(message="Confirm password must not be blank")
    private String confirmPassword;


    
    public ChangePasswordForm() {
        
    }


    
  



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((currentPassword == null) ? 0 : currentPassword.hashCode());
        result = prime * result + ((newPassword == null) ? 0 : newPassword.hashCode());
        result = prime * result + ((confirmPassword == null) ? 0 : confirmPassword.hashCode());
        return result;
    }







    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ChangePasswordForm other = (ChangePasswordForm) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (currentPassword == null) {
            if (other.currentPassword != null)
                return false;
        } else if (!currentPassword.equals(other.currentPassword))
            return false;
        if (newPassword == null) {
            if (other.newPassword != null)
                return false;
        } else if (!newPassword.equals(other.newPassword))
            return false;
        if (confirmPassword == null) {
            if (other.confirmPassword != null)
                return false;
        } else if (!confirmPassword.equals(other.confirmPassword))
            return false;
        return true;
    }







    @Override
    public String toString() {
        return "ChangePasswordForm [id=" + id + ", currentPassword=" + currentPassword + ", newPassword=" + newPassword
                + ", confirmPassword=" + confirmPassword + "]";
    }



    public ChangePasswordForm(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNewPassword() {
        return newPassword;
    }
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    public String getConfirmPassword() {
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }



    public String getCurrentPassword() {
        return currentPassword;
    }



    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    
}
