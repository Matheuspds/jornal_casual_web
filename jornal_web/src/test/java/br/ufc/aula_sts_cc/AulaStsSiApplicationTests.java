package br.ufc.aula_sts_cc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.ufc.trabalho_final_web.TrabalhoFinalWebApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TrabalhoFinalWebApplication.class)
@WebAppConfiguration
public class AulaStsSiApplicationTests {

	@Test
	public void contextLoads() {
	}

}
