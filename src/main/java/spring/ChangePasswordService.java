// 암호를 변경할 Member 데이터를 찾기위해 email을 사용함. 
package spring;

public class ChangePasswordService {

	private MemberDao memberDao;

	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if (member == null)
			throw new MemberNotFoundException();

		member.changePassword(oldPwd, newPwd);

		memberDao.update(member);
	}

	// setter 객체를 통해서 의존 객체를 주입받는
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

}
