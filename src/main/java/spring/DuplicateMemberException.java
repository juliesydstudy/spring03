// 회원가입 처리에 필요한 클래스 
// 동일한 이메일을 갖고있는 회원이 이미 존재할때 MemberRegisterService가 발생시키는 익셉션 타입 
package spring; 

public class DuplicateMemberException extends RuntimeException {
	public DuplicateMemberException(String message) {
		super(message);
	}
}