package emlakburada.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class EmailConfig {

	@Value("${smtpServer}")
	private String smtpServer;
	@Value("${smtpPort}")
	private String smtpPort;
	@Value("hacipoke@gmail.com")
	private String username;
	@Value("eben1234***")
	private String password;
	@Value("${from}")
	private String from;
	@Value("${subject}")
	private String subject;

}