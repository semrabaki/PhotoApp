package com.appsdeveloperblog.app.ws.shared.dto;

public class UserDto {
	
	private static final long serialVersionUID = 6835192601898364280L;
	private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean emailVerificationStatus = false;
    private List<AddressDTO> addresses;

}
