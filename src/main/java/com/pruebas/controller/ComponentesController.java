package com.pruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pruebas.exception.ResourceNotFoundException;
import com.pruebas.model.Componente;
import com.pruebas.repository.ComponenteRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class ComponentesController {

	@Autowired
	private ComponenteRepository componenteRepository;
	@Autowired

	@GetMapping("/componentes")
	public Map<String, Integer> getAllComponents() {
		List<Componente> lista = componenteRepository.findAll();
		Map<String, Integer> obj = new HashMap<String, Integer>();
		lista.forEach(t -> {
			obj.put(t.getElemento(), t.getEstado());
		});
		return obj;
	}

	@GetMapping("/componentes/update-data/{data}")
	public void updateData(@PathVariable(value = "data") String data) {
	    String[] arregloDatos = data.split("_");

	    // Actualizar el estado de los componentes en la base de datos
	    Optional<Componente>
	    
	    optionalComponente = componenteRepository.findByElemento("ultra1");
	    if (optionalComponente.isPresent()) {
	    	Componente componente = optionalComponente.get();
	    	componente.setEstado(Integer.parseInt(arregloDatos[0]));
	    	componenteRepository.save(componente);
	    }

	    optionalComponente = componenteRepository.findByElemento("ultra2");
	    if (optionalComponente.isPresent()) {
	        Componente componente = optionalComponente.get();
	        componente.setEstado(Integer.parseInt(arregloDatos[1]));
	        componenteRepository.save(componente);
	    }

	    optionalComponente = componenteRepository.findByElemento("ultra3");
	    if (optionalComponente.isPresent()) {
	    	Componente componente = optionalComponente.get();
	    	componente.setEstado(Integer.parseInt(arregloDatos[2]));
	    	componenteRepository.save(componente);
	    }
	}

	@GetMapping("/componentes/{elemento}/{estado}")
	public ResponseEntity<Componente> updateComponent(@PathVariable(value = "elemento") String elemento,
			@PathVariable(value = "estado") Integer estado) throws ResourceNotFoundException {
		Optional<Componente> optionalComponente = componenteRepository.findByElemento(elemento);
		Componente componenteActualizado = null;

		Componente componente = optionalComponente.get();
		componente.setEstado(estado);
		componenteActualizado = componenteRepository.save(componente);

		return ResponseEntity.ok(componenteActualizado);
	}
}
