package py.edu.facitec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import py.edu.facitec.entidad.Alumno;
import py.edu.facitec.repositorios.AlumnoRepository;

@Controller
public class AlumnoController {

	@Autowired
	private AlumnoRepository alumnoRepository;

	@RequestMapping("/form")
	public String metodo() {
		return "vista/alumno/formulario";
	}

	@RequestMapping(value = "/registrar", method = RequestMethod.POST)
	public ModelAndView registrar(Alumno alumno) {
		alumnoRepository.save(alumno);

		ModelAndView modelAnd = new ModelAndView("redirect:form");

		System.out.println("Registrado con exitor" + alumno.toString());

		return modelAnd;
	}
}
