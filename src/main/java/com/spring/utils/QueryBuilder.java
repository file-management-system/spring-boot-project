package com.spring.utils;

public class QueryBuilder {
	public static final String NJ_GET_ALL = "SELECT * FROM USER";
	public static final String NJ_INSERT = "INSERT INTO USER(USER_ID, EMAIL, PASSWORD) VALUES(:K_USER_ID,:K_EMAIL,:K_PASSWORD)";
	public static final String NJ_GET_USER_BY_ID = "SELECT * FROM USER WHERE USER_ID = :K_USER_ID";
	public static final String NJ_DELETE_USER_BY_ID = "SELETE FROM USER WHERE USER_ID = :K_USER_ID";
	public static final String NJ_DELETE_ALL = "DELETE FROM USER";
	public static final String NJ_UPDATE_PASSWORD_BY_ID = "UPDATE USER SET PASSWORD = :K_PASSWORD WHERE USER_ID = :K_USER_ID";
	
	public static final String NJT_GET_ALL = "SELECT * FROM ORGANISATION";
	public static final String NJT_INSERT = "INSERT INTO ORGANISATION(ID,NAME, CODE) VALUES(:K_ID,:K_NAME,:K_CODE)";
	public static final String NJT_GET_ORGANISATION_BY_ID = "SELECT * FROM ORGANISATION WHERE ID = :K_ID";
	public static final String NJT_DELETE_ORGANISATION_BY_ID = "SELETE FROM ORGANISATION WHERE ID = :K_ID";
	public static final String NJT_DELETE_ALL = "DELETE FROM ORGANISATION";
	public static final String NJT_UPDATE_NAME_BY_ID = "UPDATE ORGANISATION SET NAME = :K_NAME WHERE ID = :K_ID";
	
	public static final String NJTT_GET_ALL = "SELECT * FROM ROLE";
	public static final String NJTT_INSERT = "INSERT INTO ROLE(ID,NAME, CODE) VALUES(:K_ID,:K_NAME,:K_CODE)";
	public static final String NJTT_GET_ROLE_BY_ID = "SELECT * FROM ROLE WHERE ID = :K_ID";
	public static final String NJTT_DELETE_ROLE_BY_ID = "SELETE FROM ROLE WHERE ID = :K_ID";
	public static final String NJTT_DELETE_ALL = "DELETE FROM ROLE";
	public static final String NJTT_UPDATE_NAME_BY_ID = "UPDATE ROLE SET NAME = :K_NAME WHERE ID = :K_ID";
}
