package com.portfolio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.beans.Logs;

@RestController
public class LogsController {
	
	@Autowired
	private LogsController _logsService;
	@GetMapping(path = "/logs/all")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public List<Logs> getAllLogs(){
		return _logsService.getAllLogs();
	}

	
	@GetMapping(path = "/logs/{id}")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<Logs> getLogs(@PathVariable ("id") int id){
		return _logsService.getLogs(id);
		
	}
	
	@PostMapping(path = "/logs")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public Logs addLogs(@RequestBody Logs logs) {
		return _logsService.addLogs(logs);
	}
	
//	@PutMapping(path = "/logs/{id}")
//	@ResponseBody
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public Logs updateLogs(@RequestBody Logs logs, @PathVariable("id") int id) {
//		return _logsService.updateLogs(logs, id);
//	}
//	
//	@DeleteMapping(path = "/logs/{id}")
//	public void deleteLogs(@PathVariable("id") int id) {
//		_logsService.deleteLogs(id);
//	}
//	

}
