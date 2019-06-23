// 두개 이상의 설정파일을 사용하는 또 다른 방법은 @Import 애노테이션을 사용하는 것임 

package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.MemberDao;
import spring.MemberPrinter;


// @Import 애노테이션으로 지정한 AppConf2 설정 클래스도 함께 사용하기 때문에 스프링 컨테이너를 생성할 때
// AppConf2 설정 클래스를 지정할 필요가없다. 
@Configuration
@Import({AppConf2.class})
public class AppConfImport {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
}
