// 세터 메서드를 이용해서 의존 객체를 주입받는 코드
// 이 클래스는 지정한 이메일을 갖는 Member를 찾아서 정보를 콘솔에 출력한다
package spring;

// @Autowired 애노테이션은 스프링 빈에 의존하는 다른 빈을 자동으로 주입하고 싶을 때 사용한다. 
import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {

	@Autowired
	private MemberDao memDao;
	@Autowired
	private MemberPrinter printer;

	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

	// MemberDao 타입의 객체에 대한 의존을 주입할때 사용 
	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}

	// MemberPrinter 타입의 객체에 대한 의존을 주입할 때 사용 
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

}
