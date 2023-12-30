package curso.api.rest.controle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class IndexControler {
	//serviço RestFull
	@GetMapping(value = "/", produces = "aplication/json")
	public ResponseEntity init(@RequestParam(value = "nome", required = false, defaultValue = "Nome não informado")String nome) {
		System.out.println("Parametro Sendo Recebido:"+nome);
		return new ResponseEntity("Olá Usuário Rest Springboot, seu nome é:"+nome, HttpStatus.OK);
	}
}
