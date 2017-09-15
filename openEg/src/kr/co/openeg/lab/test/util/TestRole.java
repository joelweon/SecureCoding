package kr.co.openeg.lab.test.util;

public class TestRole {
  public static void main(String[] args) {
	  Role r = Role.getInstance();
	  System.out.println(r.adminLists());
	  String[] a = r.getAdminRoles();
	  a[0] = "홍길동";
	  System.out.println(r.adminLists());
  }
}
